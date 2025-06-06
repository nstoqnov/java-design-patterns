package org.example.shapes;

import org.example.visitor.Visitor;

public class Circle extends Dot{
    private int radius;

    public Circle(int id, int x, int y, int radius) {
        super(id, x, y);
        this.radius = radius;
    }
    @Override
    public String accept(Visitor visitor) {
        return null;
    }
    public int getRadius() {
        return radius;
    }
}
