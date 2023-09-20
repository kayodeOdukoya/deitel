package tdd;

import mrFemiClass.Multiplication;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationWithoutOperator {
    @Test
    public void testThatTwoNumbersWillMultiplyWithoutOperator(){
        Multiplication multiplication = new Multiplication();
        int result = Multiplication.multiplication(5,5);
        assertEquals(25, result);

    }


}
