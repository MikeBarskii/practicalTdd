package com.epam.mbarskii.calculator;

import com.epam.mbarskii.practiceTdd.calculator.Calculator;
import com.epam.mbarskii.practiceTdd.calculator.SimpleCalculator;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static java.math.BigDecimal.valueOf;
import static junit.framework.TestCase.assertEquals;

public class SimpleCalculatorTest {

    private Calculator calculator;

    @Before
    public void setup() {
        calculator = new SimpleCalculator();
    }

    @Test
    public void checkSumOfIntegerValues() {
        BigDecimal result = calculator.sum(valueOf(8), valueOf(4));
        assertEquals(valueOf(12), result);
    }

    @Test
    public void checkSumOfDoubleValues() {
        BigDecimal result = calculator.sum(valueOf(8.15), valueOf(4.15));
        assertEquals(valueOf(12.3), result);
    }

    @Test
    public void checkSubtractOfIntegerValues() {
        BigDecimal result = calculator.subtract(valueOf(8), valueOf(4));
        assertEquals(valueOf(4), result);
    }

    @Test
    public void checkSubtractOfDoubleValues() {
        BigDecimal result = calculator.subtract(valueOf(8.15), valueOf(4.05));
        assertEquals(valueOf(4.1), result);
    }

    @Test
    public void checkDivideOfIntegerValues() {
        BigDecimal result = calculator.divide(valueOf(8), valueOf(4));
        assertEquals(valueOf(2), result);
    }

    @Test
    public void checkDivideOfDoubleValues() {
        BigDecimal result = calculator.divide(valueOf(8.12), valueOf(4.01));
        assertEquals(valueOf(2.02493765586), result);
    }

    @Test
    public void checkMultiplyOfIntegerValues() {
        BigDecimal result = calculator.multiply(valueOf(8), valueOf(4));
        assertEquals(valueOf(32), result);
    }

    @Test
    public void checkMultiplyOfDoubleValues() {
        BigDecimal result = calculator.multiply(valueOf(8.12), valueOf(4.01));
        assertEquals(valueOf(32.5612), result);
    }

}
