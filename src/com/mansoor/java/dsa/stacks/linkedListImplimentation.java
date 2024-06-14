package com.mansoor.java.dsa.stacks;

public class linkedListImplimentation {
    public static class Node {  // user defined datatype
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static class Stack {  // user defined data structure
        Node head = null;
        int size = 0;

        void push(int x){
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }
        int size(){
            return size;
        }
        void displayRec(Node h){
            if (h==null) return;
            displayRec(h.next);
            System.out.print(h.val+" ");
        }

        void display(){
            displayRec(head);
            System.out.println();
        }

        void displayRev(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println( );
        }
        int pop(){
            if (head==null){
                System.out.println("stack is Empty");
                return -1;
            }
            int x=head.val;
            head=head.next;
            return x;
        }
        int peek(){
            if (head==null){
                System.out.println("stack is Empty");
                return -1;
            }
            return head.val;
        }

    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
        st.display();
        st.push(5);
        st.display();
        st.push(45);
        st.display();
        st.push(20);
        st.display();
        System.out.println(st.size());
        st.pop();
        System.out.println(st.size());
        st.push(7);
        st.push(0);
    }
}
