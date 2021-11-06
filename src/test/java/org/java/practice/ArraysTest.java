package org.java.practice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArraysTest {
    private Arrays arrays = new Arrays();
    private final static int[][] TEST_NUMBERS = {
                                                    {74, 7875, 2974, -98784},
                                                    {41, 0, -97, 5656, 2},
                                                    {3},
                                                    {1005, -987846, 154}
                                                };

    @Test
    public void getMaxNumFromArrayTest() {
        int max = arrays.getMaxNumFromArray(TEST_NUMBERS);
        assertEquals(7875, max);
    }

    @Test
    public void getMinNumFromArrayTest() {
        int min = arrays.getMinNumFromArray(TEST_NUMBERS);
        assertEquals(-987846, min);
    }

    @Test
    public void getSumAllNumbersFromArrayTest() {
        int sum = arrays.getSumAllNumbersFromArray(TEST_NUMBERS);
        assertEquals(-1068943, sum);
    }

    @Test
    public void getAverageNumFromArrayTest() {
        int sum = arrays.getAverageNumFromArray(TEST_NUMBERS);
        assertEquals(-82226, sum);
    }

}
