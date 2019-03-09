package com.step.assignments.inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MangoTest {

    @Test
    void shouldReturnCompleteDetailAboutMango(){
        Mango mango = new Mango("Yellow", 120);
        String expectedResult = "name is Mango and its taste is sweet colour is Yellow price is 120";
        assertEquals(expectedResult, mango.getDetails());
        assertEquals("Mango", mango.getName());
    }

}