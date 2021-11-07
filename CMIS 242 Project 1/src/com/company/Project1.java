// This class file is part of the CMIS 242 Project 1 package.
package com.company;

import javax.swing.JFileChooser;
import java.awt.*;
import java.io.*;
import java.util.Scanner;
import java.lang.System;

public class Project1 extends Component {
    Weight[] weight = new Weight[25];
    public Weight[] openFile() throws FileNotFoundException {
        int count = 0;
        JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = fc.showOpenDialog(this);
        if(result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fc.getSelectedFile();
            System.out.println("Selected File:" + selectedFile.getAbsolutePath());
            Scanner scanner = new Scanner(selectedFile.getAbsoluteFile());
            int pound;
            double ounce;
                while (scanner.hasNext()) {
                    pound = scanner.nextInt();
                    ounce = scanner.nextDouble();
                    count++;
                }
                if (count > 25) {
                    System.out.println("This file has more than 25 entries, " +
                            "please reduce the number of entries and try again");
                    System.exit(1);
                }
                else {
                    count = 0;
                    Scanner s = new Scanner(selectedFile.getAbsoluteFile());
                    while (s.hasNext()) {
                        pound = s.nextInt();
                        ounce = s.nextDouble();
                        weight[count] = new Weight(pound, ounce);
                        System.out.println(weight[count].toString());
                        count++;
                    }
                }
        }
        return weight;
    }

    private static Weight findMinimum(Weight[] weight, int arraySize) {
        Weight minimum = weight[0];
        for (int i = 0; i < arraySize; i++) {
            if (weight[i].lessThan(minimum)) {
                minimum = weight[i];
            }
        }
        return minimum;
    }

    private static Weight findMaximum(Weight[] weight, int arraySize) {
        Weight maximum = weight[0];
        for (int i = 0; i < arraySize; i++) {
            if (!weight[i].lessThan(maximum)) {
                maximum = weight[i];
            }
        }
        return maximum;
    }

    private static Weight findAverage(Weight[] weight, int arraySize) {
        Weight average = weight[0];
        for (int i = 1; i < arraySize; i++) {
        }
    }
}
