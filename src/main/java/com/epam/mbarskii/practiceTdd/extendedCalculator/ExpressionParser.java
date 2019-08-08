package com.epam.mbarskii.practiceTdd.extendedCalculator;

public class ExpressionParser implements Parser {

    private final String expression;

    private int carriagePosition = 0;

    public ExpressionParser(String expression) {
        this.expression = expression;
        if (!isExpressionStartAndEndCorrectly()) {
            throw new ArithmeticException("You've set invalid expression");
        }
    }

    @Override
    public String takeNextItem() {
        char currentChar = getCurrentChar();
        carriagePosition++;
        char nextChar = getCurrentChar();

        if (isCharsNonDigit(currentChar, nextChar))
            throw new ArithmeticException("You've set invalid expression");

        StringBuilder result = new StringBuilder();
        result.append(currentChar);
        while (carriagePosition <= expression.length() - 1
                && isCharsDigit(currentChar, nextChar)) {
            result.append(nextChar);
            carriagePosition++;
        }

        return result.toString();
    }

    private boolean isCharsNonDigit(char x, char y) {
        return !Character.isDigit(x) && !Character.isDigit(y);
    }

    private boolean isCharsDigit(char x, char y) {
        return Character.isDigit(x) && Character.isDigit(y);
    }

    private char getCurrentChar() {
        return expression.charAt(carriagePosition);
    }

    private boolean isExpressionStartAndEndCorrectly() {
        char firstChar = expression.charAt(0);
        char lastChar = expression.charAt(expression.length() - 1);
        return Character.isDigit(firstChar) && Character.isDigit(lastChar);
    }
}
