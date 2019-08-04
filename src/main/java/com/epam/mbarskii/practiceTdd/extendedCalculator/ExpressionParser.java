package com.epam.mbarskii.practiceTdd.extendedCalculator;

public class ExpressionParser implements Parser {

    private final String expression;

    private String currentItem = "";
    private int carriagePosition = 0;


    public ExpressionParser(String expression) {
        this.expression = expression;
        if (!isExpressionStartAndEndCorrectly()) {
            throw new ArithmeticException("You've set invalid expression");
        }
    }

    @Override
    public String takeNextItem() {
        char currentValue = expression.charAt(carriagePosition++);
        char nextValue = expression.charAt(carriagePosition);

        boolean isCurrentValueDigit = Character.isDigit(currentValue);
        boolean isNextValueDigit = Character.isDigit(nextValue);
        if (!isCurrentValueDigit && !isNextValueDigit)
            throw new ArithmeticException("You've set invalid expression");

        StringBuilder result = new StringBuilder();
        result.append(currentValue);
        while (carriagePosition <= expression.length() - 1
                && isCurrentValueDigit
                && isNextValueDigit) {
            result.append(nextValue);
            carriagePosition++;
        }

        return result.toString();
    }

    private boolean isValuesDigit(char... values) {
        for (char value: values) {
            if (!Character.isDigit(value))
                return false;
        }
        return true;
    }

    private boolean isExpressionStartAndEndCorrectly() {
        char firstChar = expression.charAt(0);
        char lastChar = expression.charAt(expression.length() - 1);
        return Character.isDigit(firstChar) && Character.isDigit(lastChar);
    }
}
