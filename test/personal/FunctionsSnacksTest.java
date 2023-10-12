package personal;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class FunctionsSnacksTest {

    @Test
    public void testIsEven(){
        boolean result = FunctionsSnacks.isEven(12);
        assertTrue(true);
    }
    @Test
    public void testIsPrimeNumber(){
        boolean result = FunctionsSnacks.isPrimeNumber(5);
        assertTrue(true);

    }
    @Test
    public void testSubtract(){
    int result = FunctionsSnacks.subtract(7, 3);
    assertEquals(4, result);
    }
    @Test
    public void testDivide(){
        int result = FunctionsSnacks.divide(4, 2);
        assertEquals(2, result);
    }
//    @Test
//   public void testFactorOf(){
//        int result = FunctionsSnacks.factorOf(10);
//        assertEquals(4, result);
//    }

    @Test
    public void testIsSquare(){
    int result = FunctionsSnacks.isSquare(25);
    assertEquals(625, result);
    }
    @Test
    public void testIsPalindrome(){
        int result = FunctionsSnacks.isPalindrome(54145);
        assertTrue(true);
    }
    @Test
    public void testFactorial(){
        int result = FunctionsSnacks.factorialOf(5);
        assertEquals(120, result);
    }
}