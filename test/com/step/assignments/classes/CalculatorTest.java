
package com.step.assignments.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    void shouldReturnInvalidValueString() {
        Calculator calculator = new Calculator(2f,4f);
        double addtion = calculator.getAdditionResult();
        assertEquals(6, addtion);

        calculator.setFirstNumber(2);
        assertEquals(2,calculator.getFirstNumber());

        calculator.setSecondNumber(5);
        assertEquals(5, calculator.getSecondNumber());

        assertEquals(10,calculator.getMultiplyResult());
        assertEquals(7,calculator.getAdditionResult());

        assertEquals(0.4, calculator.getDivisionResult());

    }
}

