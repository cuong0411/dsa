package org.cuong.array;

public class FindSecondMax {
    public static void main(String[] args) {
        // int[] numbers = { 33, 10, 33, 1, 32, 0, 32 };
        int[] numbers = { 33, 33 };
        System.out.println(findSecondMax(numbers));

    }

    static int findSecondMax(int[] a) {
        if (a == null || a.length < 2) {
            throw new IllegalArgumentException("Invali input (The lenght of the array is less than 2)");
        }
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                secondMax = max;
                max = a[i];
            } else if (a[i] > secondMax && a[i] != max) {
                secondMax = a[i];
            }
        }
        return secondMax;

    }
}
