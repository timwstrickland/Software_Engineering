package com.company;

import javax.swing.*;
import java.awt.*;

public class Drawing extends JPanel {
    private Shape shape;

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(shape != null) {
            String numberOfShapes = Integer.toString(shape.getNoOfShapes());
            shape.draw(g);
            g.drawString(numberOfShapes, 0, 0);
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(200, 200);
    }

    public void drawShape(Shape s) throws OutsideBounds {
        if (s.getHeight() > this.getHeight() || s.getWidth() > this.getWidth()) {
            throw new OutsideBounds("This shape is too large!");
        }
        else {
            this.shape = s;
            repaint(this.shape);
        }
    }
}
