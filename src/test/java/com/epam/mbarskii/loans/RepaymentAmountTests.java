package com.epam.mbarskii.loans;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Spy;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.*;

public class RepaymentAmountTests {

    @Spy
    LoanApplication loanApplication;

    private LoanCalculatorController controller;

    @Before
    public void setup() {
        loanApplication = spy(new LoanApplication());
        controller = spy(new LoanCalculatorController());

        LoanRepository repository = mock(LoanRepository.class);
        JavaMailSender mailSender = mock(JavaMailSender.class);
        RestTemplate restTemplate = mock(RestTemplate.class);

        controller.setData(repository);
        controller.setMailSender(mailSender);
        controller.setRestTemplate(restTemplate);
    }

    @Test
    public void test1YearWholePounds() {
        loanApplication.setPrincipal(1200);
        loanApplication.setTermInMonths(12);
        doReturn(new BigDecimal(10)).when(loanApplication).getInterestRate();

        controller.processNewLoanApplication(loanApplication);

        assertEquals(new BigDecimal(110), loanApplication.getRepayment());
    }

    @Test
    public void test2YearWholePounds() {
        loanApplication.setPrincipal(1200);
        loanApplication.setTermInMonths(24);
        doReturn(new BigDecimal(10)).when(loanApplication).getInterestRate();

        controller.processNewLoanApplication(loanApplication);

        assertEquals(new BigDecimal(60), loanApplication.getRepayment());
    }

    @Test
    public void test5YearWithRounding() {
        loanApplication.setPrincipal(5000);
        loanApplication.setTermInMonths(60);
        doReturn(new BigDecimal(6.5)).when(loanApplication).getInterestRate();

        controller.processNewLoanApplication(loanApplication);

        assertEquals(new BigDecimal(111), loanApplication.getRepayment());
    }
}
