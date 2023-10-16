package chapter7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayOddEvenStaticTest {
    @Test
    public void testOddNumber(){
        int[] newArray = {5, 4, 1, 0, 6, 7, 9};

        int result =ArrayOddEvenStatic.getOddPosition(newArray);
        assertEquals(11, result);
    }
    @Test
    public void testEvenNumber(){
        int[] newArray = {5, 4, 1, 0, 6, 7, 9};
        int result = ArrayOddEvenStatic.getEvenPosition(newArray);
        assertEquals(21, result);
    }
    @Test
    public void addingOddNumbers(){
        int[] newArray = {5, 4, 1, 0, 6, 7, 9, 1};
        int result = ArrayOddEvenStatic.addOddPosition(newArray);
        assertEquals(23, result);
    }
    @Test
    public void addingEvenNumbers(){
        int[] newArray = {5, 4, 1, 0, 6, 7, 9, 2};
        int result = ArrayOddEvenStatic.addEvenPosition(newArray);
        assertEquals(12, result);
    }
}