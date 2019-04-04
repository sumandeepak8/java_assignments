package com.step.assignments.comparableandcomparator.Main;

import java.util.*;


public class Main {

    private static class Pers implements Comparable<Pers>{
        private String name;
        private int age;

        public Pers(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int compareTo(Pers o) {
            if(this.age > o.age)
                return 1;
            if(this.age < o.age)
                return -1;
            return 0;
        }
    }

    public static void main(String[] args) {
        List<Map> list = new ArrayList<>();
        Map<String, Integer> map1 = new HashMap();
        Map<String, Integer> map2 = new HashMap();
        Map<String, Integer> map3 = new HashMap();
        Map<String, Integer> map4 = new HashMap();

        map1.put("Suman", 20);
        map2.put("bhawna", 23);
        map3.put("deepika", 22);
        map4.put("srushti", 19);
        list.add(map1);
        list.add(map2);
        list.add(map3);
        list.add(map4);
    }
}
