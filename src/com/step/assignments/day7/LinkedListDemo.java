package com.step.assignments.day7;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        for (int i = 0; i < 6; i++) {
            linkedList.add(i+1);
        }

        System.out.println("it should equal to 3 " + linkedList.get(3));
        System.out.println("its size should be equal to 6 "+ linkedList.size());
        System.out.println("it is adding 9 to it " +linkedList.add(9));
        System.out.println("its size should be equal to 7 " + linkedList.size());
        System.out.println("it should be equal to 9 " + linkedList.getLast());
    }
}
