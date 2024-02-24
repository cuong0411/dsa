package org.cuong.recursion;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniquePaths {
    public static void main(String[] args) {
        System.out.println(uniquePaths(1, 1));
        System.out.println(uniquePaths(2, 2));
        System.out.println(uniquePaths(3, 3));
        System.out.println(uniquePaths(3, 7));

        Map<List<Integer>, Integer> memo = new HashMap<>();
        System.out.println(uniquePaths(3, 7, memo));
    }

    static int uniquePaths(int rows, int columns) {
        if (rows == 1 || columns == 1)
            return 1;
        return uniquePaths(rows - 1, columns) + uniquePaths(rows, columns - 1);
    }

    static int uniquePaths(int rows, int columns, Map<List<Integer>, Integer> memo) {
        if (rows == 1 || columns == 1) {
            return 1;
        }
        List<Integer> key = Arrays.asList(rows, columns);
        if (memo.get(key) == null) {
            memo.put(key, uniquePaths(rows - 1, columns) + uniquePaths(rows, columns - 1));
        }
        return memo.get(key);
    }
}
