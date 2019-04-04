package com.step.assignments.day9.Collections;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MapDemoTest {

    @Test
    @DisplayName("should override the first value of the specific key by new one")
    void shouldReplaceTheOldValueByNewValue(){
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1,"suman");
        map.put(2,"srushti");
        map.put(3,"deepika");
        map.put(4,"gayatri");

        assertEquals(4,map.keySet().size());
        assertEquals("deepika", map.get(3));
        assertEquals(null, map.get(6));


        for (Map.Entry <Integer, String > data : map.entrySet()){
            System.out.println("key is " + data.getKey() + " and value is " + data.getValue());
        }
    }



}