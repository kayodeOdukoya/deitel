package tdd;

import chapter7.ArraySnacks;
import org.junit.jupiter.api.Test;

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
}