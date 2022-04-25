package com.summultiples.summultiples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest
{
    @Test
    public void SumEquals35(){
        assertEquals(35, Calculator.Sum(12));
    }
}