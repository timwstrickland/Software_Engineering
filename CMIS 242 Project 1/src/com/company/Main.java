package com.company;

/* Author: Timothy Strickland
   Date: 11/6/2021
   Purpose: Review of CMIS 242 Project 1 Homework
   Description: This program will compute the minimum, maximum, and average weight of a collection of weights that is
   read from an input file.
   Revision: 1
   Dependencies: weight.java, Project1.java
 */

import java.io.PipedOutputStream;

public class Main {

    public static void main(String[] args) {
	Project1 p = new Project1();
	p.openFile();
    }
}
