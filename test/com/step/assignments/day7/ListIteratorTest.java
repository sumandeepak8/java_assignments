package com.step.assignments.day7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ListIteratorTest {


    @Test
    @DisplayName("should return true when there is next element")
    void hasNext() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(2);
        ListIterator listIterator = new ListIterator(arrayList);
        assertTrue(listIterator.hasNext());
    }

    @Test
    @DisplayName("should return false when there is no next element")
    void hasNext1() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ListIterator iterator = new ListIterator(list);
        assertFalse(iterator.hasNext());
    }

    @Test
    @DisplayName("should return the integer when there is next element")
    void next() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Integer a = 3;
        arrayList.add(a);
        ListIterator listIterator = new ListIterator(arrayList);
        assertEquals(a,listIterator.next());
    }

    @Test
    @DisplayName("should return the error message that list doesn't have any element")
    void next1() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ListIterator iterator = new ListIterator(list);
        assertEquals("No such element it contains",iterator.next());
    }
}
