package com.kodilla.patterns2.testing.loop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class testLoopAndConditionalBreakpoints {

    @Test
    public void testLoop() {
        //Given
        long sum = 0;
        //When
        for(int i = 0; i != 1000; ++i) {
            sum += i;
            System.out.println("[ "+i+" ] Sum equals: " + sum);
        }
        //Then
        Assertions.assertEquals(499500, sum);
    }
}
