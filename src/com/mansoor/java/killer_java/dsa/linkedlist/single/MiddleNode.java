package com.mansoor.java.killer_java.dsa.linkedlist.single;

public class MiddleNode {

    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static void displayAll(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static int size(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    public static void middle(Node head) {
        int size = size(head);
        if (size == 0) {
            System.out.println("Empty list");
            return;
        }

        Node slow = head;
        Node fast = head;

        // Move 'fast' two steps and 'slow' one step at a time
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if (size % 2 == 0) {
            // Size is even, print the next element as middle
            System.out.println("Middle (even size): " + slow.next.val);
        } else {
            // Size is odd, print the middle node
            System.out.println("Middle (odd size): " + slow.val);
        }
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(5);
        Node c = new Node(18);
        Node d = new Node(1);
        Node e = new Node(55);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        displayAll(a);
        middle(a);
    }
}
