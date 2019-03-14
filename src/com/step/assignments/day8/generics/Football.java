package com.step.assignments.day8.generics;

public class Football implements Team{
    private String name;
    private int noOfPlayers;

    public Football(String name, int noOfPlayers) {
        this.name = name;
        this.noOfPlayers = noOfPlayers;
    }

    public String getName() {
        return name;
    }

    public int getNoOfPlayers() {
        return noOfPlayers;
    }
}
