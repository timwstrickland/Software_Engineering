package com.company;

public class InvalidPolynomialSyntax extends Exception{
    // custom exception for specific issue.
    public InvalidPolynomialSyntax() {
        super();
    }

    public InvalidPolynomialSyntax(String s) {
        super(s);
    }
}
