package com.step.assignments.day5.composition;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;

    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea() {
        return 22 * this.radius* this.radius/7;
    }
}
