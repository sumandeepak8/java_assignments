package com.step.assignments.classes;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpeedConverterTest {

    @Test
    @DisplayName("should return 1 when the speed will be 1.60934 kilometer per hour")
    void shouldReturnOne() {
        SpeedConverter speedConverter = new SpeedConverter(1.60934);
        assertEquals(1,speedConverter.toMilesPerHour());
    }

    @Test
    @DisplayName("should return 1 when the speed will be 1.60934 kilometer per hour")
    void shouldReturnNegativeOne() {
        SpeedConverter speedConverter = new SpeedConverter(-0.99);
        assertEquals(-1, speedConverter.toMilesPerHour());
    }

}