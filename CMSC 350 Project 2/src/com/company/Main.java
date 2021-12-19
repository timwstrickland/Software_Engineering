package com.company;

import javax.swing.*;
import java.io.File;

public class Main {

    public static void main(String[] args) {
        JFileChooser polynomialFile = new JFileChooser();
        polynomialFile.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        polynomialFile.setCurrentDirectory(new File(System.getProperty("user.dir")));
        int returnVal = polynomialFile.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = polynomialFile.getSelectedFile();
        }

    }
}
