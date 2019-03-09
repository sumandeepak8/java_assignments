package com.step.assignments.methodOverloading;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    @Test
    void shouldCallMethodBasedOnInputParameters(){
        Sum sum = new Sum();
        assertEquals(4.0,sum.getSum(1d,3)); // return double but takes first as double as second as int
        assertEquals(4,sum.getSum(1d,3)); // return only int and also takes only int.

        assertEquals(4.9,sum.getSum(1,3.90d));
        assertEquals(6.0,sum.getSum(1,4,1));
        assertEquals(4.0,sum.getSum(1,4,-1));
    }

}