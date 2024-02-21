package org.cuong.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class DuplicatedValueTest {

    @Test
    public void testHasDuplicatedValueWithDuplicatedValues() {
        DuplicatedValue duplicatedValue = new DuplicatedValue();
        int[] arr = {1, 2, 3, 4, 5, 1};
        assertTrue(duplicatedValue.hasDuplicatedValue_linearSolution(arr));
    }

    @Test
    public void testHasDuplicatedValueWithoutDuplicatedValues() {
        DuplicatedValue duplicatedValue = new DuplicatedValue();
        int[] arr = {1, 2, 3, 4, 5};
        assertFalse(duplicatedValue.hasDuplicatedValue_linearSolution(arr));
    }

    @Test
    public void testHasDuplicatedValueWithEmptyArray() {
        DuplicatedValue duplicatedValue = new DuplicatedValue();
        int[] arr = {};
        assertFalse(duplicatedValue.hasDuplicatedValue_linearSolution(arr));
    }

    @Test
    public void testHasDuplicatedValueWithNullArray() {
        DuplicatedValue duplicatedValue = new DuplicatedValue();
        int[] arr = null;
        assertFalse(duplicatedValue.hasDuplicatedValue_linearSolution(null));
    }

    @Test
    public void testHasDuplicatedValueWithSingleElementArray() {
        DuplicatedValue duplicatedValue = new DuplicatedValue();
        int[] arr = {1};
        assertFalse(duplicatedValue.hasDuplicatedValue_linearSolution(arr));
    }

    @Test
    public void testHasDuplicatedValueWithMultipleDuplicatedValues() {
        DuplicatedValue duplicatedValue = new DuplicatedValue();
        int[] arr = {1, 2, 3, 4, 4, 5, 5};
        assertTrue(duplicatedValue.hasDuplicatedValue_linearSolution(arr));
    }

    @Test
    public void testHasDuplicatedValueWithAllSameValues() {
        DuplicatedValue duplicatedValue = new DuplicatedValue();
        int[] arr = {1, 1, 1, 1, 1};
        assertTrue(duplicatedValue.hasDuplicatedValue_linearSolution(arr));
    }

    @Test
    public void testHasDuplicatedValueWithLargeArray() {
        DuplicatedValue duplicatedValue = new DuplicatedValue();
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i % 10; // Fill array with repeated values
        }
        assertTrue(duplicatedValue.hasDuplicatedValue_linearSolution(arr));
    }
}