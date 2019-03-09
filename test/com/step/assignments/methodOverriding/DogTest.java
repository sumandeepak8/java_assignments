package com.step.assignments.methodOverriding;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void shouldPrintDetails(){
        Animal animal = new Animal("Cow", 3, false);
        assertEquals("Cow", animal.getName());
        assertEquals(3, animal.getAge());

        Dog dog = new Dog("Tommy", 8, true);
        assertEquals("this is name : Tommy" , dog.getName()); // method overriding.
        assertEquals(8, dog.getAge()); // using method of super class

        assertEquals(true, dog.isCanSpeak());

        dog.setCanSpeak(false);
        assertEquals(false,dog.isCanSpeak());


    }

}