package com.company;

import javax.swing.*;
import java.awt.*;

public class GuiClass extends JFrame {
    // Set Variables
    // Create JPanels to be used
    private JPanel topPanel;
    private JPanel midPanel;
    private JPanel bottomPanel;
    // Create JLabels
    private JLabel enterExpression;
    private JLabel result;
    // Create text fields
    private JTextField enterExpressionField;
    private JTextField resultField;
    // Create JButtons
    private JButton prefixToPostfix;
    private JButton postfixToPrefix;

    public GuiClass() {
        // create the frame
        super("Expression Converter");
        GridBagLayout gbl = new GridBagLayout();
        setLayout(gbl);
        topPanel = new JPanel();
        topPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10,10,10,10);
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
        enterExpression = new JLabel("Enter Expression");
        topPanel.add(enterExpression, gbc);
        gbc.gridx = 1;
        enterExpressionField = new JTextField();
        enterExpressionField.setColumns(20);
        topPanel.add(enterExpressionField, gbc);
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        prefixToPostfix = new JButton("Prefix to Postfix");
        prefixToPostfix.setPreferredSize(new Dimension(150, 25));
        midPanel.add(prefixToPostfix, gbc);
        gbc.gridx = 1;
        postfixToPrefix = new JButton("Postfix to Prefix");
        postfixToPrefix.setPreferredSize(new Dimension(150, 25));
        midPanel.add(postfixToPrefix, gbc);
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        result = new JLabel("Result");
        bottomPanel.add(result, gbc);
        gbc.gridx = 1;
        resultField = new JTextField();
        resultField.setColumns(20);
        resultField.setEditable(false);
        bottomPanel.add(resultField, gbc);
    }
}
