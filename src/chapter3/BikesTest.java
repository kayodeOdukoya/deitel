package chapter3;

import chapter3.Bikes;
import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class BikesTest {
    @Test
    public void testThatBikeExist(){
//        given
        Bikes myBajaj = new Bikes();
//        when
        assertNotNull(myBajaj);
    }

    @Test
    public void testThatBikeCanOn(){
//        given
        Bikes myBajaj = new Bikes();
//        when bike can turn on
        myBajaj.keyOn();
        assertEquals(false, myBajaj.keyOn());
    }

    @Test
    public void testThatBikeCanOff(){
//        given
        Bikes myBajaj = new Bikes();
//        when bike can turn off
        myBajaj.keyOff();
        assertEquals(false, myBajaj.keyOff());
    }

    @Test
    public void testThatBikeCanAccelerate(){
//        given that i have a bike and its turn on
        Bikes myBajaj = new Bikes();
//        when my bike can accelerate
        myBajaj.keyOn();
        myBajaj.accelerated();
        assertEquals(true, myBajaj.accelerated());
    }

    @Test
    public void testThatBikeIsOnGear1(){
//        given that i have a bike and its on
        Bikes myBajaj = new Bikes();
        myBajaj.keyOn();
        myBajaj.gear1();
        assertEquals(16, myBajaj.gear1());
    }

//    @Test

}
