package com.epam.mbarskii.calculator;

import com.epam.mbarskii.practiceTdd.calculator.Calculator;
import com.epam.mbarskii.practiceTdd.calculator.SimpleCalculator;
import org.junit.Test;

import java.math.BigDecimal;

import static java.math.BigDecimal.valueOf;
import static junit.framework.TestCase.assertEquals;

public class SimpleCalculatorTest {

    @Test
    public void checkSumOfIntegerValues() {
        Calculator calculator = new SimpleCalculator();
        BigDecimal result = calculator.sum(valueOf(8), valueOf(4));
        assertEquals(valueOf(12), result);
    }

    @Test
    public void checkSumOfDoubleValues() {
        Calculator calculator = new SimpleCalculator();
        BigDecimal result = calculator.sum(valueOf(8.15), valueOf(4.15));
        assertEquals(valueOf(12.3), result);
    }

    @Test
    public void checkSubtractOfIntegerValues() {
        Calculator calculator = new SimpleCalculator();
        BigDecimal result = calculator.subtract(valueOf(8), valueOf(4));
        assertEquals(valueOf(4), result);
    }

    @Test
    public void checkSubtractOfDoubleValues() {
        Calculator calculator = new SimpleCalculator();
        BigDecimal result = calculator.subtract(valueOf(8.15), valueOf(4.05));
        assertEquals(valueOf(4.1), result);
    }

    @Test
    public void checkDivideOfIntegerValues() {
        Calculator calculator = new SimpleCalculator();
        BigDecimal result = calculator.divide(valueOf(8), valueOf(4));
        assertEquals(valueOf(2), result);
    }

    @Test
    public void checkDivideOfDoubleValues() {
        Calculator calculator = new SimpleCalculator();
        BigDecimal result = calculator.divide(valueOf(8.12), valueOf(4.01));
        assertEquals(valueOf(2.02493765586), result);
    }

    @Test
    public void checkMultiplyOfIntegerValues() {
        Calculator calculator = new SimpleCalculator();
        BigDecimal result = calculator.multiply(valueOf(8), valueOf(4));
        assertEquals(valueOf(32), result);
    }

    @Test
    public void checkMultiplyOfDoubleValues() {
        Calculator calculator = new SimpleCalculator();
        BigDecimal result = calculator.multiply(valueOf(8.12), valueOf(4.01));
        assertEquals(valueOf(32.5612), result);
    }

}
