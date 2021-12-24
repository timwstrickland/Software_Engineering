package com.company;

public class InvalidTreeSyntax extends Exception {
    // custom exception
    public InvalidTreeSyntax() {
        super();
    }

    public InvalidTreeSyntax(String s) {
        super(s);
    }
}
