package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiClass extends JFrame implements ActionListener {
    // This class constructs the GUI to be used with the other classes.
    // Set variables
    // Create JPanels to be used
    private JPanel topPanel;
    private JPanel midPanel;
    private JPanel bottomPanel;
    // create JLabels
    private JLabel enterTree;
    private JLabel output;
    // create text fields
    private JTextField enterTreeTextField;
    // text field that cannot be modified.
    private JTextField outputTextField;
    // create JButtons
    private JButton makeTree;
    private JButton isBalanced;
    private JButton isFull;
    private JButton isProper;
    private JButton height;
    private JButton nodes;
    private JButton inOrder;
    // Create an empty Binary tree
    BinaryTree bt = null;

    public GuiClass() {
        // This constructor will setup the gui from scratch.
        // create the frame
        super("Binary Tree Categorizer");
        // Setup and add JPanels to frame.
        GridBagLayout gbl = new GridBagLayout();
        setLayout(gbl);
        topPanel = new JPanel();
        topPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(0,10,10, 20);
        add(topPanel, gbc);
        midPanel = new JPanel();
        midPanel.setLayout(new GridBagLayout());
        gbc.gridy = 1;
        add(midPanel, gbc);
        bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridBagLayout());
        gbc.gridy = 2;
        add(bottomPanel, gbc);
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        enterTree = new JLabel("Enter Tree:");
        topPanel.add(enterTree, gbc);
        gbc.gridx = 1;
        enterTreeTextField = new JTextField();
        enterTreeTextField.setColumns(25);
        topPanel.add(enterTreeTextField, gbc);
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        makeTree = new JButton("Make Tree");
        midPanel.add(makeTree, gbc);
        gbc.gridx = 1;
        isBalanced = new JButton("Is Balanced?");
        midPanel.add(makeTree, gbc);
        gbc.gridx = 2;
        isFull = new JButton("IsFull?");
        midPanel.add(isFull, gbc);
        gbc.gridx = 3;
        isProper = new JButton("Is Proper?");
        midPanel.add(isProper, gbc);
        gbc.gridx= 4;
        height = new JButton("Height");
        midPanel.add(height, gbc);
        gbc.gridx = 5;
        nodes = new JButton("Nodes");
        midPanel.add(nodes, gbc);
        gbc.gridx = 6;
        inOrder = new JButton("Inorder");
        midPanel.add(inOrder, gbc);
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        output = new JLabel("Output: ");
        bottomPanel.add(output, gbc);
        gbc.gridx = 1;
        outputTextField = new JTextField();
        outputTextField.setColumns(25);
        outputTextField.setEditable(false);
        bottomPanel.add(outputTextField, gbc);
        // add Action listeners
        makeTree.addActionListener(this);
        isFull.addActionListener(this);
        isProper.addActionListener(this);
        height.addActionListener(this);
        nodes.addActionListener(this);
        inOrder.addActionListener(this);
    }

    public static void main(String[] args) {
	GuiClass gc = new GuiClass();
	gc.setSize(550, 250);
	gc.setVisible(true);
	gc.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // This method implements an action when a button is pressed.
        // create an instance of the BinaryTree class to be used
        if(e.getSource() == makeTree) {
            // This statement checks to see if the makeTree button has been pressed.
            bt = new BinaryTree(enterTreeTextField.getText());
            outputTextField.setText("The Tree has been built");
        }
        else if (e.getSource() == isFull) {
            // This statement checks to see if the isFull button has been pressed.
            if(bt != null) {
            }
        }
        else if (e.getSource() == isProper) {
            // This statement checks to see if the isProper button has been pressed.
        }
        else if (e.getSource() == height) {
            // This statement checks to see if the Height button has been pressed.
        }
        else if (e.getSource() == nodes) {
            // This statement checks to see if the Nodes button has been pressed.
            if(bt != null) {
                outputTextField.setText("This tree has " + bt.getNodes() + "nodes");
            }
        }
    }
}
