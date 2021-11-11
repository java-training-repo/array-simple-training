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
        for (int[] i:numbers) {
            for (int j:i) {
                if (min > j) {
                    min = j;
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
        for (int[] i:numbers) {
            for (int j:i) {
                if (max < j) {
                    max = j;
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
        for (int[] i:numbers) {
            for (int j:i) {
                sum += j;
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
        int countOfElements = 0;

        for (int[] i:numbers) {
            countOfElements += i.length;
            for (int j:i) {
                sum += j;
            }
        }
        return sum / countOfElements;
    }

}
