package com.michaelcane;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;
    @Before public void setupInitializer() { calculator = new Calculator(); }

    @Test
    public void testSum() {
        int expectedValue = 100;
        int actualValue = calculator.sum(2, 50);
        assertEquals("actualValue should output the same int as expectedValue", expectedValue, actualValue);
    }

    @Test
    public void testSubtract() {
        int expectedValue = 50;
        int actualValue = calculator.divide(100, 2);
        assertEquals("actualValue should output the same in as expectedValue", expectedValue, actualValue);
    }

    @Test
    public void testMultiply() {

    }

    @Test
    public void testDivide() {

    }
}
