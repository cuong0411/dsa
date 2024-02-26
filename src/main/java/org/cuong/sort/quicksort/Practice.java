package org.cuong.sort.quicksort;

import java.util.Random;

public class Practice {
    public static void main(String[] args) {

        for (int j = 1; j <= 10; j++) {
            System.out.println("#" + j);
            Random rand = new Random();
            int length = rand.nextInt(10) + 1;
            int[] numbers = new int[length];

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = rand.nextInt(100);
            }
            printArray("Before:", numbers);
            quicksort(numbers);
            printArray("After:", numbers);
        }

    }

    static void quicksort(int[] numbers) {
        quicksort(numbers, 0, numbers.length - 1);
    }

    private static void quicksort(int[] numbers, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex)
            return;
        int leftPointer = partition(numbers, lowIndex, highIndex);
        quicksort(numbers, lowIndex, leftPointer - 1);
        quicksort(numbers, leftPointer + 1, highIndex);
    }

    private static int partition(int[] array, int lowIndex, int highIndex) {
        int pivot = array[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex - 1;

        while (leftPointer < rightPointer) {
            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }
            swap(array, leftPointer, rightPointer);
        }
        if (array[leftPointer] > pivot) {
            swap(array, leftPointer, highIndex);
        } else {
            leftPointer = highIndex;
        }
        return leftPointer;
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    static void printArray(String message, int[] array) {
        System.out.printf("%s\t", message);
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
