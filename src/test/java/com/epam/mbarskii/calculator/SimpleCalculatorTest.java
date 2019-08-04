package com.epam.mbarskii.calculator;

import com.epam.mbarskii.practiceTdd.calculator.Calculator;
import com.epam.mbarskii.practiceTdd.calculator.SimpleCalculator;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SimpleCalculatorTest {

    @Test
    public void checkCalculatorSum() {
        Calculator calculator = new SimpleCalculator();
        double result = calculator.sum(8, 4);
        assertEquals(result, 12);
    }

    @Test
    public void checkCalculatorSubtract() {
        Calculator calculator = new SimpleCalculator();
        double result = calculator.subtract(8, 4);
        assertEquals(result, 4);
    }

    @Test
    public void checkCalculatorDivide() {
        Calculator calculator = new SimpleCalculator();
        double result = calculator.divide(8, 4);
        assertEquals(result, 2);
    }

    @Test
    public void checkCalculatorMultiply() {
        Calculator calculator = new SimpleCalculator();
        double result = calculator.multiply(8, 4);
        assertEquals(result, 32);
    }
}
