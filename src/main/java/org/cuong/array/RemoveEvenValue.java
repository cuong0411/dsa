package org.cuong.array;

import org.cuong.array.intro.ArrayUtils;

public class RemoveEvenValue {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 3, 10, -9};
        int[] oddNumbers = removeEvenValue(numbers);

        ArrayUtils.printArray(numbers);
        ArrayUtils.printArray(oddNumbers);
    }
    public static int[] removeEvenValue(int[] arr) {
        int resultLenth = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 2) == 0 ) {
                resultLenth++;
            }
        }
        int[] result = new int[resultLenth];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 2) != 0) {
                result[index] = arr[i];
                index++;
            }
        }
        return result;
    }
}
