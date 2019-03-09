package com.step.assignments.methodOverriding;

public class Dog extends Animal{
    private String name;
    private int age;
    private boolean canSpeak;

    public Dog(String name, int age, boolean canSpeak) {
        super(name, age, canSpeak);
        this.name = name;
        this.age = age;
        this.canSpeak = canSpeak;
    }

    @Override
    public String getName(){
        return "this is name : " +  super.getName();
    }

    @Override
    public void printDetails(){
        System.out.println("This method belongs to Dog class");
        System.out.println("name is " + this.name + " age is " + this.age );
    }

}
