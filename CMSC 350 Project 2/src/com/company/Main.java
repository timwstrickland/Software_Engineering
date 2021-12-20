package com.company;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static ArrayList<Polynomial> polyList = new ArrayList<>();
    public static void main(String[] args) {
        ArrayList<String> pList = new ArrayList<>();
        JFileChooser polynomialFile = new JFileChooser();
        polynomialFile.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        polynomialFile.setCurrentDirectory(new File(System.getProperty("user.dir")));
        int returnVal = polynomialFile.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = polynomialFile.getSelectedFile();
            try {
                Scanner scanner = new Scanner(file);
                String tempString = scanner.nextLine();
                Polynomial polynomial = new Polynomial(tempString);
                System.out.println(polynomial);
                polyList.add(polynomial);
            }
            catch (FileNotFoundException e){
                JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "The File does not exist!");
            }
            catch (NoSuchElementException e) {
                JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "The file is empty!");
            }
        }
        System.out.println(polyList);
    }

    // Place holder to check weak order of the polynomial


    // Place holder to check Strong order of the polynomial
}
