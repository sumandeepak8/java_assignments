package com.step.assignments.Immutability;

import java.util.ArrayList;
import java.util.List;

public class Immutable {
    private List a;

    public Immutable(List a) {
        this.a = a;
    }

    public ArrayList getA() {
        return new ArrayList(a);
    }

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        Immutable immutable = new Immutable(integers);
        List list = immutable.getA();
        System.out.println(list + " this is list a");
        list.add("Suman");
        list.add("deepika");
        System.out.println("again list " + list +  " this is list immutable list"+ immutable.getA());


    }
}
