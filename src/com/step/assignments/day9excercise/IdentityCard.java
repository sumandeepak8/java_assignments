package com.step.assignments.day9excercise;

public class IdentityCard implements Duplicable<IdentityCard>{

    private String name;
    private int batch;

    public IdentityCard(String name, int batch) {
        this.name = name;
        this.batch = batch;
    }

    public String getName() {
        return name;
    }

    public int getBatch() {
        return batch;
    }

    @Override
    public IdentityCard getDuplicate() {
        IdentityCard duplicateIdentityCard = new IdentityCard(this.name, this.batch);
        return  duplicateIdentityCard;
    }
}
