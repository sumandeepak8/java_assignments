package com.step.assignments.methodOverriding;

public class Animal {
    private String name = "Dog";
    private int age;
    private boolean canSpeak;

    public Animal(){
    }

    public Animal(String name, int age, boolean canSpeak){
        this.name = name;
        this.age = age;
        this.canSpeak = canSpeak;
    }

    public String getName(){
        return this.name;
    }

    public void printDetails(){
        System.out.println("This method belongs from Animal class");
        System.out.println("name is " + this.name + " age is " + this.age + " canSpeak : " + this.canSpeak);
    }

    public void setCanSpeak(boolean canSpeak){
        this.canSpeak = canSpeak;
    }

    public boolean isCanSpeak(){
        return this.canSpeak;
    }

    public int getAge(){
        return this.age;
    }

}
