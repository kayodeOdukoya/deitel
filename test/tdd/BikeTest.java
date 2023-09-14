package tdd;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    @Test
    public void testThatIHaveABike(){
        Bike myBike = new Bike();
        assertNotNull(myBike);
    }
    @Test
    public void testThatMyBikeCanTurnOn(){
        Bike myBike = new Bike();
        assertFalse(myBike.isOn());
        myBike.powerOn();
        assertTrue(myBike.isOn());
    }
    @Test
    public void testThatMyBikeCanAccelerateWithGear1(){
        Bike myBike = new Bike();
        myBike.powerOn();
        assertTrue(myBike.isOn());
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        myBike.checkGear();
        assertEquals(3, myBike.getSpeed());
        assertEquals(3, myBike.checkGear());
    }
    @Test
    public void testThatMyBikeCanAccelerateWithGear2(){
        Bike myBike = new Bike();
        myBike.powerOn();
        assertTrue(myBike.isOn());
        int count;
        for (count = 0; count <= 20; count = count +1) {
            myBike.accelerate();
        }
        assertEquals(21,myBike.getSpeed());
        myBike.accelerate();
        myBike.accelerate();
        assertEquals(25, myBike.getSpeed());
        myBike.accelerate();
        myBike.accelerate();
        assertEquals(27, myBike.getSpeed());
        assertEquals(2,myBike.checkGear());
    }
    @Test
    public void testThatMyBikeCanAccelerateWithGear3(){
        Bike myBike = new Bike();
        myBike.powerOn();
        assertTrue(myBike.isOn());
         int count;
         for (count = 0; count <= 20; count = count + 1){
             myBike.accelerate();
         }
         for (count = 21; count <= 25; count = count + 1){
             myBike.accelerate();
         }
         assertEquals(31, myBike.getSpeed());

         myBike.accelerate();
         myBike.checkGear();
         assertEquals(34, myBike.getSpeed());
    }
    @Test
    public void testThatMyBikeCanAccelerateWithGear4(){
        Bike myBike = new Bike();
        myBike.isOn();
        assertTrue(myBike.isOn());

    }
}
;