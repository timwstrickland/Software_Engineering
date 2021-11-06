// This class file is part of the CMIS 242 Project 1 package.

package com.company;

public class weight {
    //Initialize variables for the weight class
    private double pounds;
    private double ounces;
    private final double poundsToOunces = 16;

    public weight (double pounds, double ounces) {
        this.pounds = pounds;
        this.ounces = ounces;
    }

    public boolean lessThan (weight w) {
        //This method needs work
        return false;
    }

    public void addTo(weight w) {
        //Adds ounces to the new weight and re-calculates
        this.ounces = this.ounces + w.toOunces();
        normalize();
    }

    private double toOunces() {
        //converts pounds to ounces so that math can be done on the basic term.
        return this.pounds * poundsToOunces + this.ounces;
    }

    private void normalize() {
        //re-calculates the weight so that it is displayed in pounds and ounces.
        while (this.ounces > poundsToOunces) {
            ++this.pounds;
            this.ounces = this.ounces - poundsToOunces;
        }
    }
}
