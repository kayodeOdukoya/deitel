package tdd;

import chapter7.ArraySnacks;
import org.junit.jupiter.api.Test;

import java.awt.image.AreaAveragingScaleFilter;

import static chapter7.ArraySnacks.checkElement;
import static org.junit.jupiter.api.Assertions.*;

class ArraySnacksTest {
    @Test
    public void testLargest() {
        ArraySnacks snacks = new ArraySnacks();
        int[] array = {2, 3, 4, 6, 8};
        int result = snacks.theLargestNumber(array);
        assertEquals(8, result);
    }

    @Test
    public void testReverse() {
        ArraySnacks snacks = new ArraySnacks();
        int[] array = {5, 6, 7, 8, 9, 10};
        int[] expected = {10, 9, 8, 7, 6, 5};
        int[] result = snacks.reverseList(array);
        assertArrayEquals(expected, snacks.reverseList(array));
    }

    @Test
    public void testElementOccurence() {
        ArraySnacks snacks = new ArraySnacks();
        int[] array = {4, 6, 8};
        int expected = 8;
        assertTrue(checkElement(array, expected));
    }
    @Test
    public  void testEvenPositionElement(){
        ArraySnacks snacks = new ArraySnacks();
        int[] number = {1, 2, 4, 3, 8, 12, 13};
        int[] result = snacks.evenPositionElement(number);
        assertArrayEquals(new int[]{2, 4, 8, 12}, result);
    }
    @Test
    public void testElementOfOddPositions(){
        ArraySnacks snacks = new ArraySnacks();
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = snacks.oddPosition(number);
        assertArrayEquals(new int[]{1, 3, 7, 9}, result);

    }
    @Test
    public void testForForLoop(){
        ArraySnacks snacks = new ArraySnacks();
        int[] array = {1, 2, 3, 4};
        int sum = 10;
        int result = snacks.sumOfForLoop(array);
        assertEquals(result, sum);
    }
    @Test
    public void testWhileLoop(){
        ArraySnacks snacks = new ArraySnacks();
        int[] array = {1, 2, 3, 4};
        int sum = 10;
        int result = snacks.sumOfWhileLoop(array);
        assertEquals(result, sum);
    }
    @Test
    public void testDoWhileLoop(){
        ArraySnacks snacks = new ArraySnacks();
        int[] array = {1, 2, 3, 4};
        int sum = 10;
        int result = snacks.sumOfDoWhileLoop(array);
        assertEquals(result, sum);
    }
    @Test
    void testArrayPalindrome(){
        ArraySnacks snacks = new ArraySnacks();
        String input = "1221";
        String answer = null;
        boolean result = snacks.Palindrome(input);
        assertTrue(result, answer);
    }

}