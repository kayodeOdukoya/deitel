package assignment;

import org.testng.annotations.Test;

import static org.junit.Assert.assertNotNull;

public class LogisticsServicesTest {

    @Test
    public void testThatLogisticsExist(){
        Logistics myRider = new Logistics();
        assertNotNull(myRider);
    }
    @Test
    public void testThatRidersWagesIsLessThan50Percent(){
        Logistics myRider = new Logistics();
        int successfulDelivery = 50;


    }

}
