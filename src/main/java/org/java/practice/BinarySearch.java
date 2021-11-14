package org.java.practice;

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
        int firstIndex = 0;
        int lastIndex = numbers.length - 1;

        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            int middleNums = numbers[middleIndex];
            if (middleNums == num) {
                return middleIndex;
            } else if (middleNums > num) {
                lastIndex = middleIndex - 1;
            } else {
                firstIndex = middleIndex + 1;
            }

            }
        return -1;
        }
}