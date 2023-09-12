package chapter3;


import chapter3.Bike;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class BikeTest{
    @Test
    public void testThatOurBikeHasName(){
        Bike myBike = new Bike();
        myBike.setName("Bajaj");
        assertEquals("Bajaj", myBike.getName());
    }
@Test
    public void testThatBikeIsOn(){
        Bike myBike = new Bike();
        myBike.setOn();
        assertEquals(true, myBike.isOn());
        myBike.setOn();
        assertEquals(false, myBike.isOn());

    }

}
