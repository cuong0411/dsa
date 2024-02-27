package org.cuong.array;

import java.util.Arrays;

/*
 * Given an array of integer, write a function to move
 * all 0's to end of it while maintaining the relative order
 * of the non-zero elements.
 * example:
 * - input: {0, 1, 0, 4, 12}
 * - output: {1, 4, 12, 0, 0}
 */

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] a = { -1, 0, 1, 0, 0, 0, 4, 12 };
        System.out.println(Arrays.toString(a));
        // System.out.println(Arrays.toString(mySolution(a)));

        solution(a);
        System.out.println(Arrays.toString(a));
    }

    static void solution(int[] array) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0 && array[j] == 0) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
            if (array[j] != 0) {
                j++;
            }
        }
    }

    static int[] mySolution(int[] array) {
        int[] result = new int[array.length];
        int resultIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0)
                continue;
            result[resultIndex] = array[i];
            resultIndex++;
        }
        return result;
    }
}
