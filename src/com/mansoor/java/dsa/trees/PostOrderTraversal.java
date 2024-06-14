package com.mansoor.java.dsa.trees;

public class PostOrderTraversal {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int node) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    void postOrder(Node node) {
        if (node == null) return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6);
        root.right.left = new Node(7);
        root.right.right = new Node(8);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);

        PostOrderTraversal traversal = new PostOrderTraversal();
        System.out.print("Post-order traversal: ");
        traversal.postOrder(root);
    }

}
