package com.epam.mbarskii.extendedCalculator;

import com.epam.mbarskii.practiceTdd.extendedCalculator.MathOperator;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MathOperatorTest {

    private MathOperator mathCommand;

    @Test
    public void checkSubtractionOperatorPriority() {
        mathCommand = MathOperator.SUBTRACTION;
        int result = mathCommand.getPriority();
        assertEquals(1, result);
    }

    @Test
    public void checkOpenBracketPriority() {
        mathCommand = MathOperator.OPEN_BRACKET;
        int result = mathCommand.getPriority();
        assertEquals(0, result);
    }

    @Test
    public void checkDivisionOperatorPriority() {
        mathCommand = MathOperator.DIVISION;
        int result = mathCommand.getPriority();
        assertEquals(2, result);
    }
}
