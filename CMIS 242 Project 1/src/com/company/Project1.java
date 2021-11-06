// This class file is part of the CMIS 242 Project 1 package.

package com.company;

import javax.swing.JFileChooser;
import java.awt.*;
import java.io.File;

public class Project1 extends Component {
    public void openFile() {
        JFileChooser fc = new JFileChooser();
        //int returnVal = fc.showOpenDialog(this);
        //String path = "C:\\Users\\rcmag\\IdeaProjects\\CMIS 242 Project 1";
        fc.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = fc.showOpenDialog(this);
        if(result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fc.getSelectedFile();
            System.out.println("Selected File:" + selectedFile.getAbsolutePath());
        }
    }
}
