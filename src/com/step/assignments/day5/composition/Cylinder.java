package com.step.assignments.day5.composition;

public class Cylinder {
    private Circle baseArea;
    private int height;

    public Cylinder(Circle base,  int height){
        this.height = height;
        this.baseArea = base;
    }

    public void print(){
        System.out.println(this.baseArea + " some thing ho " + this.height);
    }

    public double getVolume(){
        return this.baseArea.getArea() * this.height;
    }

    public double getCurvedArea(){
        return  (2 * 22 * this.baseArea.getRadius() * this.height)/7;
    }
}
