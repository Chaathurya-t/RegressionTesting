
package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testMixedPositiveNegativeAndZero() {
        int[] arr = {12, -45, 0, 89, -3, 0, 27};
        assertEquals(89, Main.findLargest(arr));
        assertEquals(-45, Main.findSmallest(arr));
    }

    @Test
    public void testAllNegativeNumbers() {
        int[] arr = {-10, -50, -3, -99, -1};
        assertEquals(-1, Main.findLargest(arr));
        assertEquals(-99, Main.findSmallest(arr));
    }

    @Test
    public void testAllZeros() {
        int[] arr = {0, 0, 0, 0};
        assertEquals(0, Main.findLargest(arr));
        assertEquals(0, Main.findSmallest(arr));
    }

    @Test
    public void testSingleElement() {
        int[] arr = {-7};
        assertEquals(-7, Main.findLargest(arr));
        assertEquals(-7, Main.findSmallest(arr));
    }

    @Test
    public void testEmptyOrNullArray() {
        assertThrows(IllegalArgumentException.class, () -> Main.findLargest(new int[]{}));
        assertThrows(IllegalArgumentException.class, () -> Main.findSmallest(null));
    }
}
