package com.mansoor.java.killer_java.dsa.linkedlist.doubly;

public class DoublyLL {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
        }
    }
        public static void displayAll(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
            System.out.println();
        }
    public static void displayReverse(Node tail){
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
        System.out.println();
    }
    public static void displayRandom(Node random){
        Node temp=random;
        while(temp.prev!=null){
            temp=temp.prev;
        }
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static Node insertionAtHead(Node head,int x){
        Node t=new Node(x);
        t.next=head;
        head.prev=t;
        head=t;
        return head;
    }
    public static void insertionAtTail(Node head,int x){
        Node temp=head;

        while(temp.next!=null){
            temp=temp.next;
        }
        Node t=new Node(x);
        temp.next=t;
        t.prev=temp;
    }
    public static void insertAtIndex(Node head,int idx,int x){
        Node s=head;
        for (int i = 1; i <=idx-1; i++) {
            s=s.next;
        }
        Node r=s.next;
        Node t=new Node(x);
        s.next=t;
        t.prev=s;
        t.next=r;
        r.prev=t;

    }
    public static Node deleteHead(Node head){
        head=head.next;
        head.prev=null;
        return head;
    }
    public static Node deleteTail(Node head){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.prev;
            temp.next=null;
        }
        return head;
    }
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(1);
        Node c=new Node(70);
        Node d=new Node(8);
        Node e=new Node(5);
        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;
//        displayAll(a);
//        displayReverse(e);
//        displayRandom(c);
//        Node newHead=insertionAtHead(a,29);
//        displayAll(newHead);
//
//        insertionAtTail(a,80);
//        displayAll(a);
//        insertAtIndex(a,3,67);
//        displayAll(a);
//
//        displayAll(deleteHead(a));
//        displayAll(a);

        displayAll(a);
        displayAll(deleteTail(e));
        displayAll(a);

    }
}
