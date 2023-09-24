package mrFemiClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FactorialTest {
    @Test
    public void testThatFactorialExist(){
        Factorial factorial = new Factorial();
        assertNotNull(factorial);
    }
    @Test
    public void testCalculateFactorial(){
        Factorial factorial = new Factorial();
        int result = factorial.calculateFactorial(5);
        assertEquals(120, result);
    }
    @Test
    public void testCalculateExponential(){
        Factorial factorial = new Factorial();
        double result = factorial.calculateExponential(5);
        assertEquals(2.717, result);
    }
}
