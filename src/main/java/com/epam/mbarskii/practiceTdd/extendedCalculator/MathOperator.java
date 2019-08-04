package com.epam.mbarskii.practiceTdd.extendedCalculator;

public enum MathOperator {

    ADDITION('+', 1),
    SUBTRACTION('-', 1),
    MULTIPLICATION('*', 2),
    DIVISION('/', 2),
    OPEN_BRACKET('(', 0),
    CLOSE_BRACKET(')', 0);

    private char command;
    private int priority;

    MathOperator(char command, int priority) {
        this.command = command;
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "command='" + command + '\'' +
                ", priority='" + priority;
    }
}
