package com.company;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

public class Project3 extends JFrame implements ActionListener {
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
    private final String[] SHAPETYPE = {"Oval", "Rectangle"};
    private final String[] FILLTYPE = {"Solid", "Hollow"};
    private final String[] COLORTYPE = {"Black", "Red", "Orange", "Yellow", "Green", "Blue", "Magenta"};
    private final Color[] COLORS = {Color.black, Color.red, Color.orange, Color.yellow, Color.green, Color.blue, Color.magenta};
    // create Text Fields
    private JFormattedTextField widthTextField;
    private JFormattedTextField heightTextField;
    private JFormattedTextField xCoordinateTextField;
    private JFormattedTextField yCoordinateTextField;
    // create buttons
    private JButton drawButton;
    // create JPanels
    private JPanel leftPanel;
    private JPanel midPanel;
    private JPanel bottomPanel;
    private Drawing shapeDrawing;

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
        shapeDrawing = new Drawing();
        gbc.gridx = 2;
        add(shapeDrawing, gbc);
        shapeDrawing.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Shape Drawing",
                TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        shapeDrawing.setMaximumSize(getPreferredSize());
        GridLayout grid = new GridLayout();
        shapeDrawing.setLayout(grid);
        gbc.gridx = 2;
        gbc.gridy = 1;
        bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridBagLayout());
        add(bottomPanel, gbc);
        gbc = new GridBagConstraints();
        drawButton = new JButton("Draw");
        drawButton.addActionListener(this);
        gbc.gridx = 0;
        gbc.gridy = 0;
        bottomPanel.add(drawButton);
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
        NumberFormat nf = NumberFormat.getIntegerInstance();
        nf.setGroupingUsed(false);
        NumberFormatter nft = new NumberFormatter(nf);
        nft.setAllowsInvalid(false);
        widthTextField = new JFormattedTextField(nft);
        widthTextField.setColumns(10);
        gbc.gridy = 3;
        midPanel.add(widthTextField, gbc);
        heightTextField = new JFormattedTextField(nft);
        heightTextField.setColumns(10);
        gbc.gridy = 4;
        midPanel.add(heightTextField, gbc);
        xCoordinateTextField = new JFormattedTextField(nft);
        xCoordinateTextField.setColumns(10);
        gbc.gridy = 5;
        midPanel.add(xCoordinateTextField, gbc);
        yCoordinateTextField = new JFormattedTextField(nft);
        yCoordinateTextField.setColumns(10);
        gbc.gridy = 6;
        midPanel.add(yCoordinateTextField, gbc);
        widthTextField.setValue(0);
        heightTextField.setValue(0);
        xCoordinateTextField.setValue(0);
        yCoordinateTextField.setValue(0);
    }

    public static void main(String[] args) {
        Project3 p3 = new Project3();
        p3.setSize(700, 700);
        p3.setVisible(true);
        p3.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private Shape getShape(Drawing panel) {
        this.shapeDrawing = panel;
        Shape s;
        int w = Integer.parseInt(widthTextField.getText());
        int h = Integer.parseInt(heightTextField.getText());
        int x = Integer.parseInt(xCoordinateTextField.getText());
        int y = Integer.parseInt(yCoordinateTextField.getText());
        boolean isFilled;
        isFilled = fillTypeComboBox.getSelectedIndex() == 0;
        int colorValue = colorTypeComboBox.getSelectedIndex();
        if (shapeTypeComboBox.getSelectedIndex() == 0) {
            s = new Oval(new Rectangle(x,y,w,h), COLORS[colorValue],
                    isFilled);
        }
        else {
            s = new Rectangular(new Rectangle(x,y,w,h), COLORS[colorValue],
                    isFilled);
        }
        return s;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            if (e.getSource() == drawButton) {
                Shape selectedShape = getShape(shapeDrawing);
                try {
                    shapeDrawing.drawShape(selectedShape);
                } catch (OutsideBounds outsideBounds) {
                    outsideBounds.printStackTrace();
                }
            }
    }
}
