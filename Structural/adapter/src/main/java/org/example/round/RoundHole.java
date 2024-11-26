package org.example.round;

public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public boolean fits(RoundPeg roundpeg){
        boolean result;
        result = (this.getRadius() >= roundpeg.getRadius());
        return result;
    }
}
