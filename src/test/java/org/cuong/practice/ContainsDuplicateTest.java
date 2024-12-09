package org.cuong.practice;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ContainsDuplicateTest {

    @Test
    public void testContainsDuplicateWithDuplicates() {
        int[] nums = { 1, 2, 3, 4, 3 };
        boolean result = ContainsDuplicate.containsDuplicate(nums);
        assertTrue(result);
    }

    @Test
    public void testContainsDuplicateWithDuplicatesAtStart() {
        int[] nums = { 3, 3, 2, 1 };
        boolean result = ContainsDuplicate.containsDuplicate(nums);
        assertTrue(result);
    }

    @Test
    public void testContainsDuplicateWithDuplicatesAtEnd() {
        int[] nums = { 1, 2, 3, 4, 4 };
        boolean result = ContainsDuplicate.containsDuplicate(nums);
        assertTrue(result);
    }

    @Test
    public void testContainsDuplicateWithMultipleSetsOfDuplicates() {
        int[] nums = { 1, 2, 2, 3, 4, 4, 5, 5 };
        boolean result = ContainsDuplicate.containsDuplicate(nums);
        assertTrue(result);
    }

    @Test
    public void testContainsDuplicateWithNegativeNumbersNoDuplicates() {
        int[] nums = { -1, -2, -3, -4, -5 };
        boolean result = ContainsDuplicate.containsDuplicate(nums);
        assertFalse(result);
    }

    @Test
    public void testContainsDuplicateWithMixedPositiveAndNegativeNumbers() {
        int[] nums = { -1, 2, -3, 4, -1 };
        boolean result = ContainsDuplicate.containsDuplicate(nums);
        assertTrue(result);
    }
}
