package org.cuong.sort.quicksort;

import java.util.Arrays;

public class QuickSortMyImplementaion {
    public static void main(String[] args) {
        int[] numbers = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        System.out.println(Arrays.toString(quickSort(numbers)));
    }

    static int[] quickSort(int[] a) {
        if (a.length < 2)
            return a;
        int pivot = a[0];
        int lessLength = 0;
        int greaterLength = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] <= pivot)
                lessLength++;
            else
                greaterLength++;
        }

        int[] less = new int[lessLength];
        int[] greater = new int[greaterLength];
        int x = 0;
        int j = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] <= pivot) {
                less[x] = a[i];
                x++;
            } else {
                greater[j] = a[i];
                j++;
            }
        }

        int[] result = new int[a.length];
        int[] l = quickSort(less);
        int[] g = quickSort(greater);
        int idx = 0;
        for (int i = 0; i < a.length; i++) {
            if (i <= l.length) {
                if (i == l.length) {
                    result[i] = pivot;
                } else {
                    result[i] = l[i];
                }
            } else {
                result[i] = g[idx];
                idx++;
            }
        }
        return result;
    }
}
