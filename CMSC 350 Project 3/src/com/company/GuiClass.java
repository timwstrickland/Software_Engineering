package com.company;

import javax.swing.*;
import java.awt.*;

public class GuiClass extends JFrame {
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

    }

    public static void main(String[] args) {
	// write your code here
    }

}
