package tdd;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {
    @Test
    public void testThatAcExist(){
//        given that AC exist
        AirConditioner myAc = new AirConditioner(false, 16);
        assertNotNull(myAc);
    }
    @Test
    public void testThatAcCanBeTurnedOn(){
        // given that i have an AC
        AirConditioner myAc = new AirConditioner(false, 16);
//        when i turned it on
        assertFalse(myAc.turnOn());
        myAc.toggleOn();
        assertTrue(myAc.turnOn());
        assertEquals(true,myAc.turnOn());
    }
    @Test
    public void testThatAcCanBeTurnedOffWhenOn(){
//        given that i have an AC
        AirConditioner myAc = new AirConditioner(false, 16);
//        when i turned it off
        myAc.toggleOn();
//        assertTrue(myAc.turnOn());
        myAc.toggleOn();
        assertEquals(false,myAc.turnOn());
    }
    @Test
    public void testThatMyAcTemperatureCanBeIncrease(){
        //        given
        AirConditioner myAc = new AirConditioner(false,16);
//          when i increase my ac temperature
        myAc.toggleOn();
        //assertTrue(myAc.turnOn());
        myAc.increaseTemperature();
        myAc.increaseTemperature();
        myAc.increaseTemperature();
        myAc.increaseTemperature();
        myAc.increaseTemperature();
        myAc.increaseTemperature();
        myAc.increaseTemperature();
        myAc.increaseTemperature();
        myAc.increaseTemperature();
        myAc.increaseTemperature();
        myAc.increaseTemperature();
        myAc.increaseTemperature();
        myAc.increaseTemperature();
        myAc.increaseTemperature();
        myAc.increaseTemperature();
        myAc.increaseTemperature();
        assertEquals(30, myAc.getTemperature());
    }
@Test
    public void testThatTemperatureCanDecrease(){
        //given
        AirConditioner myAc = new AirConditioner(false, 16);
        //when
        myAc.toggleOn();
        myAc.increaseTemperature();
        myAc.increaseTemperature();
        myAc.increaseTemperature();
        myAc.increaseTemperature();
        myAc.decreaseTemperature();
        myAc.decreaseTemperature();
        myAc.decreaseTemperature();
        myAc.decreaseTemperature();
        myAc.decreaseTemperature();
        myAc.decreaseTemperature();
        assertEquals(16,myAc.getTemperature());
    }




}
