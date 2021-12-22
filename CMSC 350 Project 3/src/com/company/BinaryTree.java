package com.company;

public class BinaryTree {
    public BinaryTree(String line) {
        // Constructor that sets up the actual tree from the String that was passed in from the GUI.
        line = null; // This will be the textField from the GUI once created.
    }
    static class Node {
        // nested class that contains the nodes of the binary tree.
        char data;
        private Node left, right;
        public Node(char data) {
            this.data = data;
            // set both children of the node to null.
            left = right = null;
        }
    }

    private String makeTree() {
        // This method will construct the tree and return a String to be passed back into the GUI.
        return null;
    }

    private boolean isBalanced() {
        // This method returns true if the tree is considered to be balanced and false if not.
        // A tree is considered balanced when the absolute height difference of the left and right trees are at most 1.
        return true;
    }

    private boolean isFull() {
        // This method returns true if the tree is considered full.
        // A tree is considered full when the tree has the maximum number of nodes present for its height.
        return true;
    }

    private boolean isProper() {
        // This method returns true if the tree is considered proper.
        // A tree is considered proper when the tree has either 0 or 2 children.
        return true;
    }

    private int height() {
        // This method will return the absolute height of the tree.
        return 0;
    }

    private int nodes() {
        // This method will return the total number of nodes present in the tree.
        return 0;
    }

    private String inOrder() {
        // This method returns the output of the tree in the InOrder traversal to be sent back to the GUI.
        return null;
    }
}
