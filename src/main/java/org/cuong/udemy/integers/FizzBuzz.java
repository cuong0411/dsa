package org.cuong.udemy.integers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/fizz-buzz/
// TC: O(n), SC: O(n)
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                result.add("FizzBuzz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else {
                // result.add(Integer.toString(i));
                // result.add(String.valueOf(i));
                result.add(i + "");
            }
        }
        // result.toArray(new String[n]);
        return result;
    }

}
