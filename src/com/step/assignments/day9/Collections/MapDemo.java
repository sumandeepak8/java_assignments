package com.step.assignments.day9.Collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args){

        Map map = new HashMap<String, Integer>();
        map.put("suman", 9);
        map.put("bhawna", 5);
        map.put("srushti",4);
        map.put("gayatri",8);
        map.put("gayatri",7);
        map.put("srushti",40);


        System.out.println(map);
        System.out.println(map.get("bhawna"));


    }
}
