package tdd;

import assignment.LogisticsServices;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LogisticsServicesTest {
    @Test
    public void testThatPaymentSystemIsFunctioning(){
        LogisticsServices myRider = new LogisticsServices();
        int result = myRider.riders(80);
        assertEquals(45000, result);
    }

}