package com.company;

import java.awt.*;

public abstract class Shape extends Rectangle {
    private Color color;
    private boolean isFilled;
    private static int shapeCount;

    public Shape (Rectangle rectangle, Color color, boolean isFilled) {
        super(rectangle);
        this.color = color;
        this.isFilled = isFilled;
        shapeCount++;
    }

    public void setColor(Graphics g) {
        g.setColor(color);
        }

    public boolean getSolid() {
        return this.isFilled;
    }

    public int getNoOfShapes() {
        return shapeCount;
    }

    public abstract void draw(Graphics g);
}
