package com.company;

import java.awt.*;

public class Oval extends Shape{
    public Oval(Rectangle rectangle, Color color, boolean isFilled) {
        super(rectangle, color, isFilled);
    }

    @Override
    public void draw(Graphics g) {
        if (!this.getSolid()) {
            g.drawOval(this.x, this.y, this.width, this.height);
        }
        else {
            g.fillOval(this.x, this.y, this.width, this.height);
        }
    }
}
