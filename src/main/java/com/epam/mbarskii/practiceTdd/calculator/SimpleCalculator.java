package com.epam.mbarskii.practiceTdd.calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SimpleCalculator implements Calculator {

    @Override
    public BigDecimal sum(BigDecimal x, BigDecimal y) {
        return x.add(y).stripTrailingZeros();
    }

    @Override
    public BigDecimal subtract(BigDecimal x, BigDecimal y) {
        return x.subtract(y).stripTrailingZeros();
    }

    @Override
    public BigDecimal divide(BigDecimal x, BigDecimal y) {
        return x.divide(y, 11, RoundingMode.FLOOR).stripTrailingZeros();
    }

    @Override
    public BigDecimal multiply(BigDecimal x, BigDecimal y) {
        return x.multiply(y).stripTrailingZeros();
    }
}
