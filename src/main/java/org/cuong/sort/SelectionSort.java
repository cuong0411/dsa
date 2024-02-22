package org.cuong.sort;

import org.cuong.array.intro.ArrayUtils;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 4, 4, 3, 2, 1, 0, 1, 2, 3 };
        ArrayUtils.printArray(arr);
        selectionSort(arr);
        ArrayUtils.printArray(arr);
    }

    static void selectionSort(int[] arr) {
        int steps = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
                steps++;
            }
            if (minIdx != i) {
                int temp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = temp;
            }
            steps++;
        }
        System.out.println("Steps: " + steps);
    }
}
