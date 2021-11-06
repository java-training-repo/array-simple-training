package org.java.practice;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BinarySearchTest {
    private BinarySearch binarySearch = new BinarySearch();

    @Test
    public void noElementInTheArray() {
        int index = binarySearch.getIndexOfElement(new int[10], 5);
        assertEquals(-1, index);
    }

    @Test
    public void findElementInEvenLengthArrayShouldReturnRightIndex() {
        int index = binarySearch.getIndexOfElement(new int[]{-55, -8, -2, 0, 5, 7, 98, 10000}, 5);
        assertEquals(4, index);
    }

    @Test
    public void findElementInOddLengthArrayShouldReturnRightIndex() {
        int index = binarySearch.getIndexOfElement(new int[]{-55, -8, -2, 0, 5, 7, 98}, 5);
        assertEquals(4, index);
    }

    @Test
    public void checkComplexity() {
        int[] numbers = new int[100000000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            binarySearch.getIndexOfElement(numbers, i);
        }
        long end = System.currentTimeMillis();
        long timeForImplementedSearching = end - start;

        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linearSearch(numbers, i);
        }
        end = System.currentTimeMillis();
        long timeForLinearSearching = end - start;

        assertTrue(timeForLinearSearching > timeForImplementedSearching);
    }

    private int linearSearch(int[] numbers, int num) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == num) {
                return i;
            }
        }
        return -1;
    }

}
