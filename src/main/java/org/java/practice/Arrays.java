package org.java.practice;

public class Arrays {

    /**
     * You need to implement a method for searching min number in the array.
     *
     * @param numbers input numbers
     * @return min number
     */
    public int getMinNumFromArray(int[][] numbers) {
        int min = numbers[0][0];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (min > numbers[i][j]) {
                    min = numbers[i][j];
                }
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
        int max = numbers[0][0];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (max < numbers[i][j]) {
                    max = numbers[i][j];
                }
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
     * @return average number of the numbers
     */
    public int getAverageNumFromArray(int[][] numbers) {
        int sum = 0;
        int countElements = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum += numbers[i][j];
                countElements++;
            }
        }
        return sum / countElements;
    }

}
