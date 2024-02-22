package org.cuong.array;

import org.cuong.array.intro.ArrayUtils;

public class ReverserArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        ArrayUtils.printArray(arr);
        ArrayUtils.printArray(reverseArray(arr));
        
        reverseArrayInPlace(arr);
        ArrayUtils.printArray(arr);

    }
    public static int[] reverseArray(int[] arr) {
        int[] result = new int[arr.length];
        // int idx = 0;
        // for (int i = arr.length - 1; i >= 0; i--) {
        //     result[idx] = arr[i];
        //     idx++;
        // }
        for (int i = 0; i <= arr.length / 2; i++) {
            result[i] = arr[arr.length - 1 - i];
            result[arr.length - 1 - i] = arr[i];
        }
         return result;
    }
    public static void reverseArrayInPlace(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
