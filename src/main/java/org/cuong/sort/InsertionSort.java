package org.cuong.sort;

import org.cuong.array.intro.ArrayUtils;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 1, 1, -10, 0, 2 };
        ArrayUtils.printArray(arr);
        insertionSort(arr);
        ArrayUtils.printArray(arr);
    }

    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int position = i - 1;
            while (position >= 0 && temp < arr[position]) {
                arr[position + 1] = arr[position];
                position--;
            }
            // while (position >= 0) {
            // if (temp < arr[position]) {
            // arr[position + 1] = arr[position];
            // position--;
            // } else {
            // break;
            // }
            // }
            arr[position + 1] = temp;
        }
    }
}
