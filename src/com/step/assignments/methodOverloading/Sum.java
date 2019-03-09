package com.step.assignments.methodOverloading;

public class Sum {
    public double getSum(double x, int y){
        return x + y;
    }

    public double getSum(int x, double y){
        return x + y;
    }

    public int getSum(int x, int y){
        return x + y;
    }

    public double getSum(double x, double y, double z){
        return x + y + z;
    }

}
