package com.step.assignments.day6_arrayList;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {

    @Test
    void shouldPassAllTest(){
        ArrayList<Integer> arrayList = new ArrayList<Integer>(10);

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        assertEquals(5,arrayList.size());

        arrayList.add(6);
        arrayList.add(7);

        assertEquals(7,arrayList.size());
    }

}