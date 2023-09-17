package assignment;

import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class LogisticsServicesTest {

    @Test
    public static void printPay1(int numberOfSuccessfulDeliveries){
        int basePay = 5000;
        int totalNumberOfPackages = 50;
        int result = 0;
        int amountPerParcel = 160;
        for(totalNumberOfPackages = 50; totalNumberOfPackages <= 100; totalNumberOfPackages++){
            result = numberOfSuccessfulDeliveries * amountPerParcel + basePay;
        }
    }


}
