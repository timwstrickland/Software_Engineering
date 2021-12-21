package com.company;

import java.util.Iterator;
import java.util.Scanner;

public class Polynomial implements Iterable<Polynomial.Term>, Comparable<Polynomial> {

    // create inner static class so no one can access the Node
    class Term implements Iterator<Term> {
        double coefficient;
        int exponent;
        private Term next;

        private Term(double coefficient, int exponent) {
            this.coefficient = coefficient;
            this.exponent = exponent;
            this.next = null;
        }

        // Create getters and setters
        public void setCoefficient(double coeffecient) {
            this.coefficient = coeffecient;
        }

        public double getCoefficient() {
            return coefficient;
        }

        public void setExponent(int exponent) {
            this.exponent = exponent;
        }

        public int getExponent() {
            return exponent;
        }

        public void setNext(Term next) {
            this.next = next;
        }

        public Term getNext() {
            return next;
        }

        @Override
        public boolean hasNext() {
            return next != null;
        }

        @Override
        public Term next() {
            return next;
        }
    }

    // create main class variables
    Term head;
    int currentSize;

    // Constructor
    public Polynomial(String line) {
        //Builds the string read in from a line in the file that was passed into the main method.
        head = null;
        currentSize = 0;
        double[] terms = new double[10];
        Scanner scan = new Scanner(line);
        while (scan.hasNext()) {
            try {
                double coef = scan.nextDouble();
                int exp = scan.nextInt();
                terms[exp] += coef;
            }
            catch (Exception e) {
                throw new InvalidPolynomialSyntax();
            }
        }
        for (int i = 0; i < terms.length; i++) {
            double coef = terms[i];
            int exp = i;
            if (coef != 0) {
                addTerm(coef, exp);
            }
        }
    }

    // static class getters and setters
    public Term getHead() {
        return head;
    }

    public void setHead(Term head) {
        this.head = head;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    @Override
    public Iterator<Term> iterator() {

        return new Iterator<Term>() {
            Term current = head;
            @Override
            public boolean hasNext() {
                return current != null && current.next != null;
            }

            @Override
            public Term next() {
                Term data = current;
                current = current.next;
                return data;
            }
        };
    }
    // Overridden methods
    @Override
    public int compareTo(Polynomial other) {
        //This method compares different 2 different polynomials and returns a positive number if greater.
        //A negative number if lesser and a 0 if equal.
        Term myCurrent = head;
        Term otherCurrent = other.head;
        while (myCurrent != null && otherCurrent != null) {
            int exponentDiff = myCurrent.exponent - otherCurrent.exponent;
            if (exponentDiff != 0) {
                return exponentDiff;
            }
            int coefDiff = Double.compare(myCurrent.coefficient, otherCurrent.coefficient);
            if (coefDiff != 0) {
                return coefDiff;
            }
            myCurrent = myCurrent.next;
            otherCurrent = otherCurrent.next;
        }
        if (myCurrent == null && otherCurrent == null) {
            return 0;
        }
        if (myCurrent == null) {
            return -1;
        }
        return 1;
    }

    public String toString() {
        // builds a string based on the value of the Term(s) in the linked list.
        StringBuilder sb = new StringBuilder("");
        Term current = head;
        while (current != null) {
            sb.append(current.coefficient);
            if (current.exponent > 0) {
                sb.append("x");
                if (current.exponent > 1) {
                    sb.append("^").append(current.exponent);
                }
                if (current.next != null) {
                    sb.append(" + ");
                }
            }
            current = current.next;
        }
        return sb.toString();
    }

    public void addTerm(double coefficient, int exponent) {
        // This method adds a term at the beginning of the linked list
        Term term = new Term(coefficient, exponent);
        term.next = head;
        head = term;
        currentSize++;
    }
}


