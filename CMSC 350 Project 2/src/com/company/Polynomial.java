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
    public Polynomial (String fromFile) {
        head = null;
        currentSize = 0;
        Scanner fileInput = new Scanner(fromFile);
        while(fileInput.hasNext()) {
            addTerm(fileInput.nextDouble(), fileInput.nextInt());
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
            private Term current = getHead();
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Term next() {
                return null;
            }
        };
    }

    @Override
    public String toString() {
        return "";
    }

    // Unique methods

    public void addTerm(double coefficient, int exponent) {
        Term term = new Term(coefficient, exponent);
        term.next = head;
        head = term;
        currentSize++;
    }
}
