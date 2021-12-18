package com.company;

import org.w3c.dom.Node;

import java.util.Iterator;

public class Polynomial implements Iterable, Comparable {

    // Constructor
    public Polynomial (String poly) {

    }

    @Override
    public int compareTo(Term poly1, Term poly2) {
        // compare 2 polynomials looking at highest order exponent first, then coeffecients.
        return 0;
    }

    @Override
    public Iterator<Term> iterator() {

    }

    @Override
    public String toString() {
        return "";
    }

    static class Term {
        double coeffecient;
        int exponent;
        private Term next;

        private Term(double coeffecient, int exponent) {
            this.coeffecient = coeffecient;
            this.exponent = exponent;
            this.next = null;
        }
    }


}
