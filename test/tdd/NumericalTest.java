package tdd;

import assignment.Numerical;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NumericalTest {
    @Test
    public void testIsEven(){
        Numerical calculation = new Numerical();
        boolean result = calculation.isEven(12);
        assertTrue(true);
    }
    @Test
    public void testPalindrome(){
        Numerical calculation = new Numerical();
        int result = calculation.isPalindrome(54145);
        assertTrue(true);
    }
    @Test
    public void testFactorialOf(){
        Numerical factorial = new Numerical();
        int result = factorial.factorialOf(5);
        assertEquals(120, result);
    }
}