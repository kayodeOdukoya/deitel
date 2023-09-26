package chapter4;

import org.junit.jupiter.api.Test;
import org.yaml.snakeyaml.error.MarkedYAMLException;

import java.util.concurrent.CancellationException;

import static org.junit.jupiter.api.Assertions.*;

class CreditLimitCalculatorTest {
    @Test
    public void testThatCalculatorExist(){
        CreditLimitCalculator myCalculator = new CreditLimitCalculator();
        assertNotNull(myCalculator);
    }
    @Test
    public void testAccountNumber(){
        CreditLimitCalculator myCalculator = new CreditLimitCalculator();
        myCalculator.setAccountNumber(002124);
        assertEquals(002124, myCalculator.getAccountNumber());
    }
    @Test
    public void testBalanceAtTheBeginningOfTheMonth(){
        CreditLimitCalculator myCalculator = new CreditLimitCalculator();
        myCalculator.setBalance(200);
        assertEquals(200, myCalculator.getBalance());
    }
    @Test
    public void testChargedAsTheMonthBegin(){
        CreditLimitCalculator myCalculator = new CreditLimitCalculator();
        myCalculator.setCharges(500);
        assertEquals(500, myCalculator.getCharges());
    }
    @Test
    public void testTotalOfAllCreditsApplied(){
        CreditLimitCalculator myCalculator = new CreditLimitCalculator();
        myCalculator.setCredits(200);
        assertEquals(200, myCalculator.getCredits());
    }
    @Test
    public void testCreditLimit(){
        CreditLimitCalculator myCalculator = new CreditLimitCalculator();
        myCalculator.setCreditLimit(3000);
        assertEquals(3000, myCalculator.getCreditLimit());
    }
    @Test
    public void TestNewBalance(){
        CreditLimitCalculator myCalculator = new CreditLimitCalculator();
        myCalculator.setBalance(700);
        myCalculator.setCharges(300);
        myCalculator.setCredits(200);
        myCalculator.getNewBalance();
        assertEquals(800, myCalculator.getNewBalance());
    }
    @Test
    public void testCustomersCreditLimitExceeding(){
        CreditLimitCalculator myCalculator = new CreditLimitCalculator();
        myCalculator.setBalance(1200);
        myCalculator.setCharges(2200);
        myCalculator.setCredits(300);
        myCalculator.getNewBalance();
        assertEquals(3100, myCalculator.getNewBalance());
    }
}