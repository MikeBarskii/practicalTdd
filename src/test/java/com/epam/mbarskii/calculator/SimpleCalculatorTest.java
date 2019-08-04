package com.epam.mbarskii.calculator;

import com.epam.mbarskii.practiceTdd.calculator.Calculator;
import com.epam.mbarskii.practiceTdd.calculator.SimpleCalculator;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SimpleCalculatorTest {

    @Test
    public void checkSumOfIntegerValues() {
        Calculator calculator = new SimpleCalculator();
        double result = calculator.sum(8, 4);
        assertEquals(result, 12d);
    }

    @Test
    public void checkSumOfDoubleValues() {
        Calculator calculator = new SimpleCalculator();
        double result = calculator.sum(8.15, 4.15);
        assertEquals(result, 12.3);
    }

    @Test
    public void checkSubtractOfIntegerValues() {
        Calculator calculator = new SimpleCalculator();
        double result = calculator.subtract(8, 4);
        assertEquals(result, 4d);
    }

    @Test
    public void checkSubtractOfDoubleValues() {
        Calculator calculator = new SimpleCalculator();
        double result = calculator.subtract(8.15, 4.05);
        assertEquals(result, 4.1);
    }

    @Test
    public void checkDivideOfIntegerValues() {
        Calculator calculator = new SimpleCalculator();
        double result = calculator.divide(8, 4);
        assertEquals(result, 2d);
    }

    @Test
    public void checkDivideOfDoubleValues() {
        Calculator calculator = new SimpleCalculator();
        double result = calculator.divide(8.12, 4.01);
        assertEquals(result, 2.02493765586);
    }

    @Test
    public void checkMultiplyOfIntegerValues() {
        Calculator calculator = new SimpleCalculator();
        double result = calculator.multiply(8, 4);
        assertEquals(result, 32d);
    }

    @Test
    public void checkMultiplyOfDoubleValues() {
        Calculator calculator = new SimpleCalculator();
        double result = calculator.multiply(8.12, 4.01);
        assertEquals(result, 32.5612);
    }

}
