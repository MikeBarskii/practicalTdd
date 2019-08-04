package com.epam.mbarskii.extendedCalculator;

import com.epam.mbarskii.practiceTdd.extendedCalculator.ExpressionParser;
import com.epam.mbarskii.practiceTdd.extendedCalculator.Parser;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ExpressionParserTest {

    private Parser parser;

    @Test
    public void checkFirstNumberFromExpression() {
        String expression = "2+3";
        parser = new ExpressionParser(expression);
        String result = parser.takeNextItem();
        assertEquals("2", result);
    }

    @Test
    public void checkSecondValueFromExpression() {
        String expression = "2+3";
        parser = new ExpressionParser(expression);
        parser.takeNextItem();
        String result = parser.takeNextItem();
        assertEquals("+", result);
    }

    @Test(expected = ArithmeticException.class)
    public void checkFirstCharIsNotNumber() {
        String expression = "+3*2";
        parser = new ExpressionParser(expression);
        parser.takeNextItem();
    }

    @Test(expected = ArithmeticException.class)
    public void checkLastCharIsNotNumber() {
        String expression = "3*2+";
        parser = new ExpressionParser(expression);
        parser.takeNextItem();
    }

    @Test(expected = ArithmeticException.class)
    public void checkTwoNonDigitOneAnother() {
        String expression = "3**2";
        parser = new ExpressionParser(expression);
        parser.takeNextItem();
        parser.takeNextItem();
        parser.takeNextItem();
    }

    @Test
    public void checkBigDigitOneAnother() {
        String expression = "3*200";
        parser = new ExpressionParser(expression);
        parser.takeNextItem();
        parser.takeNextItem();
        String result = parser.takeNextItem();
        assertEquals(result, "200");
    }
}
