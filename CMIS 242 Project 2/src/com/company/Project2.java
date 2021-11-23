package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Project2 extends Frame implements ActionListener {
    //Set Variables
    Button taxButton = new Button("Compute Sales Tax");
    Button clearButton = new Button("Clear Fields");
    Button displayReport = new Button("Display Report");
    Label makeAndModel = new Label("Make and Model");
    Label salesPrice = new Label("Sales Price");
    Label milesPerGallon = new Label("Miles per Gallon");
    Label weightInPounds = new Label("Weight in Pounds");
    TextField t1 = new TextField ("", 30);
    TextField t2 = new TextField ("", 30);
    TextField t3 = new TextField ("", 20);
    TextField t4 = new TextField ("", 20);
    TextArea ta1 = new TextArea("", 1, 20);

    public Project2() {
        super("Automobile Sales Tax Calculator");
        setLayout(new FlowLayout());
        add(taxButton);
        taxButton.addActionListener(this);
        add(clearButton);
        add(displayReport);
        add(makeAndModel);
        add(salesPrice);
        add(milesPerGallon);
        add(weightInPounds);
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(ta1);
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
}
