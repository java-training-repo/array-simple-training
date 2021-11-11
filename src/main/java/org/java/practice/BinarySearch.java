package org.java.practice;
import java.util.Arrays;
public class BinarySearch {

    /**
     * You need to implement a method for searching an element in the array.
     * Please use the algorithm of binary search.
     *
     * @param numbers already sorted array.
     * @param num     the number which you should find.
     * @return the index of the number if it presents in the array or -1 if not.
     */
    public int getIndexOfElement(int[] numbers, int num) {
        int a = Arrays.binarySearch(numbers, num);
        if (a < 0) {
            return -1;
        } else {
            return a;
        }
    }
}