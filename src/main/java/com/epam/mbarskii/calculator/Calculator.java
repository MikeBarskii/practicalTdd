package com.epam.mbarskii.calculator;

import java.math.BigDecimal;

public interface Calculator {

    BigDecimal sum(BigDecimal x, BigDecimal y);

    BigDecimal subtract(BigDecimal x, BigDecimal y);

    BigDecimal divide(BigDecimal x, BigDecimal y);

    BigDecimal multiply(BigDecimal x, BigDecimal y);

}
