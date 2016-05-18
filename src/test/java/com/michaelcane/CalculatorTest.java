package com.michaelcane;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    double delta = 1e-15;
    Calculator calculator;
    @Before public void setupInitializer() { calculator = new Calculator(); }

    @Test
    public void testSum() {
        int expectedValue = 100;
        int actualValue = calculator.sum(50, 50);
        assertEquals("actualValue should output the same int as expectedValue", expectedValue, actualValue);
    }

    @Test
    public void testDivide() throws DivisionByZeroException {
        int expectedValue = 50;
        int actualValue = calculator.divide(100, 2);
        assertEquals("actualValue should output the same in as expectedValue", expectedValue, actualValue);
    }

    @Test
    public void testMultiply() {
        int expectedValue = 100;
        int actualValue = calculator.multiply(2, 50);
        assertEquals("actualValue should output the same int as expectedValue", expectedValue, actualValue);
    }

    @Test
    public void testSubtract() {
        int expectedValue = 50;
        int actualValue = calculator.subtract(100, 50);
        assertEquals("actualValue should output the same int as expectedValue", expectedValue, actualValue);
    }

    @Test
    public void testSquareRoot() throws ComplexNumberException {
        double expectedValue = 3;
        double actualValue = calculator.squareRoot(9);
        assertEquals("actualValues should output the same int as expectedValue", expectedValue, actualValue, delta);
    }

    /**
     * This tests whether or not divide will throw the desired exception.
     * @throws DivisionByZeroException
     */
    @Test(expected = DivisionByZeroException.class)
    public void testDivideForException() throws DivisionByZeroException {
        calculator.divide(100, 0);
    }

    /**
     * This tests whether or not squareRoot will throw the desired exception.
     * @throws ComplexNumberException
     */
    @Test(expected = ComplexNumberException.class)
    public void testSquareRootForException() throws ComplexNumberException {
        calculator.squareRoot(-1);
    }
}
