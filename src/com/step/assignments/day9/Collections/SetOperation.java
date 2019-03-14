package com.step.assignments.day9.Collections;

import java.util.HashSet;
import java.util.Set;

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
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();

        set1.add(3);
        set1.add(4);
        set1.add(5);
        set1.add(6);
        set1.add(9);

        set2.add(6);
        set2.add(8);
        set2.add(7);
        set2.add(4);

        SetOperation setOperation = new SetOperation(set1,set2);
        System.out.println(set1 + " this is set1");
        System.out.println(set2 + " this is set2");

        System.out.println(setOperation.getUnion() + "this is union ");
        System.out.println(setOperation.getDifference() + "this is difference ");
        System.out.println(setOperation.getIntersection() + "this is intersection ");

    }
}
