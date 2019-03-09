package com.step.assignments.classes;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setAge(int age) {
        this.age = age;
        if(age < 0 || age > 100){
            this.age = 0;
        }
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isTeen(){
        return this.age > 12 && this.age < 20;
    }

    public String getFullName() {
        return this.firstName + " " +this.lastName;
    }

}
