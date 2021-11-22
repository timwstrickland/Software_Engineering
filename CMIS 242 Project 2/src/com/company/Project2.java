package com.company;

import javax.swing.*;
import java.awt.*;

public class Project2 {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            //create new Frame and label it
            Frame f = new Frame("Automobile Sales Tax Calculator");
            //setup default layout
            f.setLayout(new FlowLayout());
            //make the frame visible and resizable. Set the size of the frame.
            f.setVisible(true);
            f.setResizable(true);
            f.setSize(300,300);
            //Create and add buttons
            Button taxButton = new Button("Compute Sales Tax");
            Button clearButton = new Button("Clear Fields");
            Button displayReport = new Button("Display Report");
            f.add(taxButton);
            f.add(clearButton);
            f.add(displayReport);
            //Create and add labels
            Label makeAndModel = new Label("Make and Model");
            Label salesPrice = new Label("Sales Price");
            Label milesPerGallon = new Label("Miles per Gallon");
            Label weightInPounds = new Label("Weight in Pounds");
            f.add(makeAndModel);
            f.add(salesPrice);
            f.add(milesPerGallon);
            f.add(weightInPounds);
            //Create and add text fields
            TextField t1, t2, t3, t4;
            t1 = new TextField ("", 30);
            t2 = new TextField ("", 30);
            t3 = new TextField ("", 20);
            t4 = new TextField ("", 20);
            f.add(t1);
            f.add(t2);
            f.add(t3);
            f.add(t4);
        });
    }
}
