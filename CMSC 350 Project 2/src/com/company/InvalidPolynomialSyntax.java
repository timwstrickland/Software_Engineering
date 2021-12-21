package com.company;

public class InvalidPolynomialSyntax extends RuntimeException{
    // custom exception for specific issue.
    public InvalidPolynomialSyntax() {
        super();
    }

    public InvalidPolynomialSyntax(String s) {
        super(s);
    }
}
