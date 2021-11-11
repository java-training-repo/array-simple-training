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
        int first = 0;
        int last = numbers.length - 1;
        int position;
        position = (first + last) / 2;
        while (first <= last) {
            if (numbers[position] == num) {
                return position;
            }
            if (numbers[position] > num) {
                last = position - 1;
            } else {
                first = position + 1;
            }
            position = (first + last) / 2;
        }
        return -1;
    }
}

