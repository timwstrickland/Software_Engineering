package com.company;

public class BinaryTree {

    public BinaryTree(String line) {
        // Constructor that sets up the actual tree from the String that was passed in from the GUI.
        makeTree(line);
    }
    static class Node {
        // nested class that contains the nodes of the binary tree.
        char data;
        private Node left, right, parent;
        public Node(char data) {
            this.data = data;
            // set both children of the node to null.
            left = right = parent = null;
        }
    }

    private void makeTree(String line) {
        // This method will construct the tree and return a String to be passed back into the GUI.
        Node node = null;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '(') {
                if (line.charAt(i) == ' ') {
                    continue;
                }
                else if (node == null) {
                    // This means there is no node yet, so we create the root node.
                    node = new Node(line.charAt(i + 1));
                    System.out.println("the root node is: " + line.charAt(i + 1));
                }
                else if (node.left == null){
                    // This means there is a node, so we add a node and set the parent to the root node.
                    node.left = new Node(line.charAt(i + 1));
                    node.left.parent = node;
                    node = node.left;
                    System.out.println("The next left node is: " + line.charAt(i + 1));
                }
                else {
                    node.right = new Node(line.charAt(i + 1));
                    node.right.parent = node;
                    node = node.right;
                    System.out.println("The next right node is: " + line.charAt(i + 1));
                }
                // set the left and right child to null.
                node.left = null;
                node.right = null;
            }
            else if (line.charAt(i) == ')') {
                // In this case we start backtracking
                //TODO implement better error checking
                assert node != null;
                node = node.parent;
            }
            else {
                // Otherwise we populate the node with the data passed in.
                //TODO implement better error checking
                assert node != null;
                node.data = line.charAt(i);
            }
        }
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

    public void makeBinaryTree(String line) {
        makeTree(line);
    }

    public boolean isTreeFull() {
        return isFull();
    }

    
}
