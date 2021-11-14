package org.java.practice;

public class Arrays {

    /**
     * You need to implement a method for searching min number in the array.
     *
     * @param numbers input numbers
     * @return min number
     */
    public int getMinNumFromArray(int[][] numbers) {
        int min = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] < min) min = numbers[i][j];
            }
        }
        return min;
    }

    /**
     * You need to implement a method for searching max number in the array.
     *
     * @param numbers input numbers
     * @return max number
     */
    public int getMaxNumFromArray(int[][] numbers) {
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] > max) max = numbers[i][j];
            }
        }
        return max;
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
            for (int j = 0; j < numbers[i].length; j++) {
                sum += numbers[i][j];
            }

        }
        return sum;
    }

    /**
     * You need to implement a method for getting average number of all numbers in the array.
     *
     * @param numbers input numbers
     * @return
     */
    public int getAverageNumFromArray(int[][] numbers) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            count = numbers[i].length + count;
            for (int j = 0; j < numbers[i].length; j++) {
                sum += numbers[i][j];
            }
        }
        return sum / count;
    }
}