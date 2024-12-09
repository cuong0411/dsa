package org.cuong.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TwoSumTest {

    @Test
    public void testTwoSum_BeginningIndices() {
        TwoSum twoSum = new TwoSum();
        int[] nums = { 3, 4, 5, 6 };
        int target = 7;
        int[] expected = { 0, 1 };
        assertArrayEquals(expected, twoSum.twoSum(nums, target));
    }

    @Test
    public void testTwoSum_MiddleIndices() {
        TwoSum twoSum = new TwoSum();
        int[] nums = { 1, 3, 5, 7, 9 };
        int target = 12;
        int[] expected = { 2, 3 };
        assertArrayEquals(expected, twoSum.twoSum(nums, target));
    }

    @Test
    public void testTwoSum_EndIndices() {
        TwoSum twoSum = new TwoSum();
        int[] nums = { 1, 2, 3, 4, 5 };
        int target = 9;
        int[] expected = { 3, 4 };
        assertArrayEquals(expected, twoSum.twoSum(nums, target));
    }

    @Test
    public void testTwoSum_NegativeNumbers() {
        TwoSum twoSum = new TwoSum();
        int[] nums = { -3, 4, 5, -6 };
        int target = -9;
        int[] expected = { 0, 3 };
        assertArrayEquals(expected, twoSum.twoSum(nums, target));
    }
}
