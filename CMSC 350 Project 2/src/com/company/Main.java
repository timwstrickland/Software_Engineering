package com.company;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static ArrayList<Polynomial> polyList;
    public static void main(String[] args) {
        polyList = new ArrayList<>();
        JFileChooser polynomialFile = new JFileChooser();
        polynomialFile.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        polynomialFile.setCurrentDirectory(new File(System.getProperty("user.dir")));
        int returnVal = polynomialFile.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = polynomialFile.getSelectedFile();
            try {
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()) {
                    String tempString = scanner.nextLine();
                    Polynomial polynomial = new Polynomial(tempString);
                    polyList.add(polynomial);
                    System.out.println(polynomial);
                }
            }
            catch (FileNotFoundException e){
                JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "The File does not exist!");
            }
            catch (NoSuchElementException e) {
                JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "The file is empty!");
            }
        }
        System.out.println(polyList);
        polyList.sort(null);
        System.out.println(polyList);
    }
}
