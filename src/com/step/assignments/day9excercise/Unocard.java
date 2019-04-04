package com.step.assignments.day9excercise;

public class Unocard implements Duplicable<Unocard> {

    private String color;
    private int number;

    public Unocard(String color, int number) {
        this.color = color;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getColor() {
        return color;
    }

    @Override
    public Unocard getDuplicate() {
        Unocard duplicateEntity =  new Unocard(this.color, this.number);
        return duplicateEntity;
    }
}
