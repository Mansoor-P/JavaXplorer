package com.mansoor.java.killer_java.dsa.trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    Node root;

    void levelOrderTraversal() {
        if (root == null) {
            return;
        }
        // Create an empty queue for level order traversal
        Queue<Node> queue = new LinkedList<>();

        // Enqueue the root node
        queue.add(root);

        while (!queue.isEmpty()) {
            // Dequeue a node from the queue and print it
            Node node = queue.poll();
            System.out.print(node.data + " ");

            // Enqueue the left child
            if (node.left != null) {
                queue.add(node.left);
            }

            // Enqueue the right child
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

    public static void main(String args[]) {
        LevelOrderTraversal tree = new LevelOrderTraversal();

        // Create the tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.println("Level order traversal of binary tree is:");
        tree.levelOrderTraversal();
    }
}


