package com.company;

import java.awt.*;
import javax.swing.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Project2 extends JFrame {
    private static final int DEFAULT_WIDTH = 800;
    private static final int DEFAULT_HEIGHT = 800;
    private static final int DEFAULT_posX = 100;
    private static final int DEFAULT_posY = 100;

    public Project2() {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setLocation(DEFAULT_posX, DEFAULT_posY);
        new JLabel("Make and Model");
    }
    public static void main(String[] args) {
	EventQueue.invokeLater(() -> {
	    var frame = new Project2();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
        JLabel label;
        label = new JLabel("Make and Model");
        label.setBounds(50,50,10,20);
        frame.add(label);
    });

    }
}
