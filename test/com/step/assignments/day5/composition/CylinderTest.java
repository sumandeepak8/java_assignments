package com.step.assignments.day5.composition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void shouldReturnAreaOfCylinder() {
        Circle circle = new Circle(7);
        Cylinder cylinder = new Cylinder(circle, 1);
        assertEquals(154,cylinder.getVolume());
        assertEquals(44,cylinder.getCurvedArea());
    }

}