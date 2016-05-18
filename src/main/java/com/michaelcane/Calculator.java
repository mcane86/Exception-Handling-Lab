package com.michaelcane;

public class Calculator {

    /**
     * This method will add two numbers together.
     * @param num1
     * @param num2
     * @return
     */
    static int sum(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * This method will divide two numbers.
     * @param num1
     * @param num2
     * @return
     * @throws DivisionByZeroException
     */
    static int divide (int num1, int num2) throws DivisionByZeroException {
        if(num2 == 0) { throw new DivisionByZeroException();}
        return num1 / num2;
    }

    /**
     * This method will multiply one number by another.
     * @param num1
     * @param num2
     * @return
     */
    static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    /**
     * This method will subtact one number from another.
     * @param num1
     * @param num2
     * @return
     */
    static int subtract(int num1, int num2) {
        return num1 -  num2;
    }

    /**
     * This method will return the square root of the number passed into it.
     * @param num
     * @return
     * @throws ComplexNumberException
     */
    static double squareRoot(double num) throws ComplexNumberException {
        if(num < 0) { throw new ComplexNumberException();}
        return Math.sqrt(num);
    }
}
