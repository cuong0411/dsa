package org.cuong.array;

import java.util.HashSet;
import java.util.Set;

public class DuplicatedValue {
    public static void main(String[] args) {
        int[] numbers = {1, 100, -3, 5, 1};
        var demo = new DuplicatedValue();
        boolean result = demo.hasDuplicatedValue(numbers);
        System.out.println(result);
    }

    public boolean hasDuplicatedValue_linearSolution(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num)) {
                return true;
            } else {
                set.add(num);
            }
        }
        return false;
    }

    public boolean hasDuplicatedValue(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
