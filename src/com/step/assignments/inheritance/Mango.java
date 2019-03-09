package com.step.assignments.inheritance;

public class Mango extends Fruits {
    private String colour;
    private int price;

    public Mango(String colour, int price){
        super("Mango", "sweet");
        this.colour = colour;
        this.price = price;
    }

    public String getDetails(){
        return getNameAndTaste() + " colour is " + this.colour + " price is " + this.price;
    }


}
