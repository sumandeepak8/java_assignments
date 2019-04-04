package com.step.assignments.day9.Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetOperation {

    private Set set1;
    private Set set2;
    private HashSet union;
    private HashSet difference;
    private HashSet intersection;

    public SetOperation(Set set1,Set set2) {
        this.set1 = set1;
        this.set2 = set2;
    }

    public HashSet getUnion(){
        this.union = new HashSet(this.set1);
        this.union.addAll(set2);
        return this.union;
    }

    public HashSet getDifference(){
        this.difference = new HashSet(this.set1);
        this.difference.removeAll(this.set2);
        return this.difference;
    }

    public HashSet getIntersection() {
        this.intersection = new HashSet();
        for (Object i : this.union) {
            if(this.set1.contains(i) && this.set2.contains(i))
                this.intersection.add(i);
        }
        return intersection;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new TreeSet();
        Set<Integer> set2 = new HashSet();
        Set<Integer> set3 = new LinkedHashSet();

        set1.add(9);
        set1.add(3);
        set1.add(5);
        set1.add(4);
        set1.add(6);

        set2.add(6);
        set2.add(8);
        set2.add(7);
        set2.add(4);

        set3.add(9);
        set3.add(3);
        set3.add(5);
        set3.add(4);
        set3.add(6);

        SetOperation setOperation = new SetOperation(set1,set2);
        System.out.println(" this is set1 HashSet " + set1);
        System.out.println(" this is set2 LinkdeHashSet " + set2);
        System.out.println(" this is set3 TreeSet " + set3);

        System.out.println("union " + setOperation.getUnion());
        System.out.println("difference " + setOperation.getDifference());
        System.out.println("intersection " + setOperation.getIntersection());
    }
}
