package org.cuong.array.intro;

public class ArrayUtils {
    public static void main(String[] args) {
        // declaration and initialization
        int[] arr1 = new int[10];
        int[] arr2 = {};

        printArray(arr1);
        printArray(arr2);
    }
    public static void printArray(int[] arr) {
        int n = arr.length;
        if (n == 0) {
            System.out.println("Empty array");
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
