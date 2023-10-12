package chapter7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardValidatorTest {
@Test
public void testTheFunctionOfCard(){
    String card = "4388576018402626";
    int result = CreditCardValidator.checkCreditNumber(card);
    assertEquals(37,result );
}
@Test
public void testCardFunction2(){
    String card = "4388576018402626";
    int result = CreditCardValidator.secondCardNumber(card);
    assertEquals(38, result);
}
@Test
public void testSumOfTheCardFunction(){
    String card = "4388576018402626";
    int result = CreditCardValidator.sum(card);
    assertEquals(75, result);
}
}