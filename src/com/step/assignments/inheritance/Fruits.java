package com.step.assignments.inheritance;

public class Fruits {
    private String name;
    private String taste;

    public Fruits(String name, String taste){
        this.name = name;
        this.taste = taste;
    }

    public String getNameAndTaste(){
        return "name is " + this.name + " and its taste is " + this.taste;
    }

    public String getName(){
        return this.name;
    }

}
