package com.epam.mbarskii.extendedCalculator;

import com.epam.mbarskii.practiceTdd.extendedCalculator.ExpressionParser;
import com.epam.mbarskii.practiceTdd.extendedCalculator.Parser;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ExpressionParserTest {

    private Parser parser;

    @Test
    public void checkFirstNumberFromExpression() {
        parser = new ExpressionParser();
        String line = "2+3";
        String result = parser.takeNextItem(line);
        assertEquals("2", result);
    }
}
