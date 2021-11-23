package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Project2 extends Frame implements ActionListener, ItemListener {
    //Set Variables
    Button taxButton = new Button("Compute Sales Tax");
    Button clearButton = new Button("Clear Fields");
    Button displayReportButton = new Button("Display Report");
    Label makeAndModel = new Label("Make and Model");
    Label salesPrice = new Label("Sales Price");
    Label milesPerGallon = new Label("Miles per Gallon");
    Label weightInPounds = new Label("Weight in Pounds");
    TextField t1 = new TextField ("", 30);
    TextField t2 = new TextField ("", 30);
    TextField t3 = new TextField ("", 20);
    TextField t4 = new TextField ("", 20);
    TextArea ta1 = new TextArea("", 1, 20);
    CheckboxGroup vehicleTypeSelected = new CheckboxGroup();
    Checkbox hybrid = new Checkbox("Hybrid", false, vehicleTypeSelected);
    Checkbox electric = new Checkbox("Electric", false, vehicleTypeSelected);
    Checkbox other = new Checkbox("Other", true, vehicleTypeSelected);

    public Project2() {
        super("Automobile Sales Tax Calculator");
        setLayout(new FlowLayout());
        add(taxButton);
        taxButton.addActionListener(this);
        clearButton.addActionListener(this);
        displayReportButton.addActionListener(this);
        hybrid.addItemListener(this);
        electric.addItemListener(this);
        other.addItemListener(this);
        add(clearButton);
        add(displayReportButton);
        add(makeAndModel);
        add(salesPrice);
        add(milesPerGallon);
        add(weightInPounds);
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(ta1);
        add(hybrid);
        add(electric);
        add(other);
    }

    public static void main(String[] args) {
        Project2 p2 = new Project2();
        p2.setSize(400, 400);
        p2.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Automobile a = new Automobile();
        double salesTax = a.salesTax(30000);
        ta1.setText("" + salesTax);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        int radioState;
        if (hybrid.getState()) {
            radioState = 1;
        }
        if (electric.getState()) {
            radioState = 2;
        }
        if (other.getState()) {
            radioState = 3;
        }
    }
}
