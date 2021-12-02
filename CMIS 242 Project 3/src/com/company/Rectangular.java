package com.company;

import java.awt.*;

public class Rectangular extends Shape{
    public Rectangular (Rectangle rectangle, Color color, boolean isFilled) {
        super(rectangle, color, isFilled);
    }

    @Override
    public void draw(Graphics g) {
        if (!this.getSolid()) {
            g.drawRect(this.x, this.y, this.width, this.height);
        }
        else {
            g.fillRect(this.x, this.y, this.width, this.height);
        }
    }
}
