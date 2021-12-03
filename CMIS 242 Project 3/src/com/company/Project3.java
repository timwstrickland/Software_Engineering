package com.company;

import javax.swing.*;
import java.awt.*;

public class Project3 extends JFrame {
    // create JLabels
    private JLabel shapeTypeLabel;
    private JLabel fillTypeLabel;
    private JLabel colorLabel;
    private JLabel widthLabel;
    private JLabel heightLabel;
    private JLabel xCoordinateLabel;
    private JLabel yCoordinateLabel;
    // create combo boxes
    private JComboBox<String> shapeTypeComboBox;
    private JComboBox<String> fillTypeComboBox;
    private JComboBox<String> colorTypeComboBox;
    // create Arrays for combo boxes
    private final String[] SHAPETYPE= {"Oval", "Rectangle"};
    private final String[] FILLTYPE = {"Solid", "Hollow"};
    private final String[] COLORTYPE = {"Black", "Red", "Orange", "Yellow", "Green", "Blue", "Magenta"};
    // create Text Fields
    private JTextField widthTextField;
    private JTextField heightTextField;
    private JTextField xCoordinateTextField;
    private JTextField yCoordinateTextField;
    // create buttons
    private JButton drawButton;
    // create JPanels
    private JPanel leftPanel;
    private JPanel midPanel;
    private JPanel rightPanel;
    private JPanel bottomPanel;

    public Project3() {
        //create the frame
        super("Geometric Drawing");
        GridBagLayout gbl = new GridBagLayout();
        setLayout(gbl);
        //create first panel with layout
        leftPanel = new JPanel();
        leftPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10,10,10,10);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        add(leftPanel, gbc);
        gbc.gridx = 1;
        midPanel = new JPanel();
        midPanel.setLayout(new GridBagLayout());
        add(midPanel, gbc);
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(18,0,0,30);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 0;
        gbc.gridy = 0;
        shapeTypeLabel = new JLabel("Shape Type");
        leftPanel.add(shapeTypeLabel, gbc);
        gbc.gridy = 1;
        fillTypeLabel = new JLabel("Fill Type");
        leftPanel.add(fillTypeLabel, gbc);
        gbc.gridy = 2;
        colorLabel = new JLabel("Color");
        leftPanel.add(colorLabel, gbc);
        gbc.gridy = 3;
        widthLabel = new JLabel("Width");
        leftPanel.add(widthLabel, gbc);
        gbc.gridy = 4;
        heightLabel = new JLabel("Height");
        leftPanel.add(heightLabel, gbc);
        gbc.gridy = 5;
        xCoordinateLabel = new JLabel("x coordinate");
        leftPanel.add(xCoordinateLabel, gbc);
        gbc.gridy = 6;
        yCoordinateLabel = new JLabel("y coordinate");
        leftPanel.add(yCoordinateLabel, gbc);
        // Add Combo Boxes to Panel
        shapeTypeComboBox = new JComboBox<String>(SHAPETYPE);
        Dimension comboBoxSize = new Dimension(100, 20);
        shapeTypeComboBox.setPreferredSize(comboBoxSize);
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(14,0,0,10);
        gbc.anchor = GridBagConstraints.WEST;
        midPanel.add(shapeTypeComboBox, gbc);
        fillTypeComboBox = new JComboBox<String>(FILLTYPE);
        fillTypeComboBox.setPreferredSize(comboBoxSize);
        gbc.gridy = 1;
        midPanel.add(fillTypeComboBox, gbc);
        colorTypeComboBox = new JComboBox<String>(COLORTYPE);
        colorTypeComboBox.setPreferredSize(comboBoxSize);
        gbc.gridy = 2;
        midPanel.add(colorTypeComboBox, gbc);
        widthTextField = new JTextField();
        widthTextField.setColumns(10);
        gbc.gridy = 3;
        midPanel.add(widthTextField, gbc);
        heightTextField = new JTextField();
        heightTextField.setColumns(10);
        gbc.gridy = 4;
        midPanel.add(heightTextField, gbc);
        xCoordinateTextField = new JTextField();
        xCoordinateTextField.setColumns(10);
        gbc.gridy = 5;
        midPanel.add(xCoordinateTextField, gbc);
        yCoordinateTextField = new JTextField();
        yCoordinateTextField.setColumns(10);
        gbc.gridy = 6;
        midPanel.add(yCoordinateTextField, gbc);

    }

    public static void main(String[] args) {
        Project3 p3 = new Project3();
        p3.setSize(600, 600);
        p3.setVisible(true);
        p3.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
