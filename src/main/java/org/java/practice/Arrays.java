package org.java.practice;

public class Arrays {

    /**
     * You need to implement a method for searching min number in the array.
     *
     * @param numbers input numbers
     * @return min number
     */
    public int getMinNumFromArray(int[][] numbers) {
        return -1;
    }

    /**
     * You need to implement a method for searching max number in the array.
     *
     * @param numbers input numbers
     * @return max number
     */
    public int getMaxNumFromArray(int[][] numbers) {
        return -1;
    }

    /**
     * You need to implement a method for getting sum of all numbers in the array.
     *
     * @param numbers input numbers
     * @return sum of the numbers
     */
    public int getSumAllNumbersFromArray(int[][] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; sum += numbers[i][j], j++) {}
        }
        return sum;
    }

    /**
     * You need to implement a method for getting average number of all numbers in the array.
     *
     * @param numbers input numbers
     * @return average number of the numbers
     */
    public int getAverageNumFromArray(int[][] numbers) {
        return -1;
    }

}
