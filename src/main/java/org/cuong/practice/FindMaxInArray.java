package org.cuong.practice;

public class FindMaxInArray {
    /**
     * Finds the largest element in the given array.
     *
     * @param a the array of integers to search through
     * @return the largest integer in the array
     * 
     *         Time Complexity: O(n), where n is the number of elements in the
     *         array.
     *         The method iterates through the array once to find the maximum value.
     * 
     *         Space Complexity: O(1), as it uses a constant amount of extra space
     *         regardless of the input size.
     */
    public int findMax(int[] a) {
        int maxIndex = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > a[maxIndex]) {
                maxIndex = i;
            }
        }
        return a[maxIndex];
    }

    /**
     * Finds the second largest element in the given array.
     *
     * @param a the array of integers to search through
     * @return the second largest integer in the array
     * 
     *         Time Complexity: O(n), where n is the number of elements in the
     *         array.
     *         The method iterates through the array once to determine the first and
     *         second
     *         largest values.
     * 
     *         Space Complexity: O(1), as it uses a constant amount of extra space
     *         regardless of the input size.
     */
    public int findSecondMax(int[] a) {
        if (a.length == 2) {
            return a[0] > a[1] ? a[1] : a[0];
        }
        int firstMax;
        int secondMax;
        if (a[0] > a[1]) {
            firstMax = a[0];
            secondMax = a[1];
        } else {
            firstMax = a[1];
            secondMax = a[0];
        }

        for (int i = 2; i < a.length; i++) {
            if (a[i] > firstMax) {
                secondMax = firstMax;
                firstMax = a[i];
            } else if (a[i] > secondMax) {
                secondMax = a[i];
            }
        }

        return secondMax;
    }

    public static void main(String[] args) {
        int[] a = { 1, 10, -1, 0, 3 };
        FindMaxInArray findMaxInArray = new FindMaxInArray();
        System.out.println(findMaxInArray.findMax(a));
        System.out.println(findMaxInArray.findSecondMax(a));
    }
}
