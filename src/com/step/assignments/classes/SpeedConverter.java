package com.step.assignments.classes;

public class SpeedConverter {
    private double kilometersPerHour;

    public SpeedConverter(double kilometersPerHour) {
        this.kilometersPerHour = kilometersPerHour;
    }

    public long toMilesPerHour(){
        if(this.kilometersPerHour < 0){
            return -1;
        }
        return Math.round(this.kilometersPerHour /1.60934);
    }
}
