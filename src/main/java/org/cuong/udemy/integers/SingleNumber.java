package org.cuong.udemy.integers;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/single-number/
// TC: O(n), SC: O(1)
public class SingleNumber {

    /**
     * Finds the single number in an array where every other number appears twice.
     * This approach uses XOR operation (bit manipulation)
     *
     * @param nums an array of integers where every element appears twice except for
     *             one
     * @return the single number that appears only once
     */
    public int singleNumber(int[] nums) {
        int result = 0;
        for (var i : nums) {
            result = result ^ i; // XOR
        }
        return result;
    }

    // TC: O(n), SC: O(n)
    public int singleNumberBruteForce(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (var i : nums) {
            if (set.contains(i)) {
                set.remove(i);
            } else {
                set.add(i);
            }
        }
        return set.iterator().next();
    }

    public static void main(String[] args) {
        System.out.println(new SingleNumber().singleNumber(new int[] { 4 }));
    }
}
