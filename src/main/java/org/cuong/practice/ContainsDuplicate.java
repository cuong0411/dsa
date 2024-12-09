package org.cuong.practice;

import java.util.HashSet;
import java.util.Set;

// https://neetcode.io/problems/duplicate-integer
/**
 * Given an integer array nums, return true if any value
 * appears more than once in the array, otherwise return false.
 * Example 1:
 * Input: nums = [1, 2, 3, 3]
 * Output: true
 */
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 3 };
        System.out.println(containsDuplicate(a));
    }

    /**
     * Checks if the given array contains any duplicate integers.
     *
     * @param nums an array of integers to be checked for duplicates
     * @return true if any integer appears more than once in the array, otherwise
     *         false
     */
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i)) {
                return true;
            }
            set.add(i);
        }
        return false;
    }

}
