package org.cuong.array;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {10, 2, 0, 3, 4, 5, -9};
        System.out.println("Min: " + findMin(arr));
    }

    static int findMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid input.");
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
