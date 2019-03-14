package com.step.assignments.day8.generics;

public class Cricket implements Team{
    private String name;
    private int noOfPlayers;

    public Cricket(String name, int noOfPlayers) {
        this.name = name;
        this.noOfPlayers = noOfPlayers;
    }

    public String getName() {
        return this.name;
    }

    public int getNoOfPlayers() {
        return noOfPlayers;
    }


}
