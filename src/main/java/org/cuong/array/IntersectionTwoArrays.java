package org.cuong.array;

import java.util.HashMap;
import java.util.Map;

import org.cuong.array.intro.ArrayUtils;

public class IntersectionTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 2 };
        int[] arr2 = { 0, 2, 4, 6, 8, 2 };

        int[] result = intersection(arr1, arr2);
        ArrayUtils.printArray(result);
    }

    static int[] intersection(int[] arr1, int[] arr2) {
        Map<Integer, Boolean> map = new HashMap<>();
        for (int i : arr1) {
            map.put(i, true);
        }

        int length = 0;
        for (int i : arr2) {
            if (map.getOrDefault(i, false)) {
                length++;
            }
        }

        int[] result = new int[length];
        int idx = 0;
        for (int i : arr2) {
            if (map.getOrDefault(i, false)) {
                result[idx] = i;
                idx++;
            }
        }
        return result;
    }
}
