package com.company;

import java.util.Iterator;
import java.util.Scanner;

public class Polynomial implements Iterable<Polynomial.Term>, Comparable<Polynomial> {
    // create inner static class so no one can access the Node
    static class Term {
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
    }

    // create main class variables
    Term head;
    int currentSize;

    // Constructor
    public Polynomial(String fromFile) {
        head = null;
        currentSize = 0;
        Scanner fileInput = new Scanner(fromFile);
        while (fileInput.hasNext()) {
            addTerm(Double.parseDouble(fileInput.next()), Integer.parseInt(fileInput.next()));
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

    // Overridden methods
    @Override
    public int compareTo(Polynomial next) {
        return 0;
    }

    @Override
    public Iterator<Term> iterator() {
        return new Iterator<Term>() {
            // assign our current variable and get the head node.
            Term current = getHead();

            @Override
            public boolean hasNext() {
                // return true if there exists another coefficient and exponent term.
                return current != null && current.getNext() != null;
            }

            @Override
            public Term next() {
                // assign our data values to current from the current node
                Term data = current;
                // move to the next node
                current = current.next;
                // return our data
                return data;
            }
        };
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        Term current = head;
        while (current.next != null) {
            if (current.coefficient > 1) {
                sb.append(current.coefficient);
            }
            if (current.exponent > 0 && current.coefficient > 0) {
                if (current.exponent > 1) {
                    sb.append("x^").append(current.exponent).append(" + ");
                } else {
                    sb.append("x").append(" + ");
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
        // System.out.println(head.getCoefficient() + " " + head.getExponent());
        currentSize++;
    }
}


