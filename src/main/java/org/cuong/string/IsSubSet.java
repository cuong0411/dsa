package org.cuong.string;

import java.util.HashMap;
import java.util.Map;

public class IsSubSet {
    public static void main(String[] args) {
        Character[] array1 = {'a', 'b', 'c', 'd'};
        Character[] array2 = {'b', 'c'};
        Character[] array3 = {'b', 'c', 'f'};
        System.out.println(isSubSet(array1, array2));
        System.out.println(isSubSet(array1, array3));

        System.out.println(isSubSet_HashTable(array1, array2));
        System.out.println(isSubSet_HashTable(array1, array3));
    }

    /*
     * Use HashTable for fast look-up
     * O(N) with N is sum of two array's lengths
     */
    static boolean isSubSet_HashTable(Character[] array1, Character[] array2) {
        Character[] smallArray;
        Character[] largeArray;
        if (array1.length > array2.length) {
            smallArray = array2;
            largeArray = array1;
        } else {
            smallArray = array1;
            largeArray = array2;
        }
        Map<Character, Boolean> map = new HashMap<>();
        for (Character c : largeArray) {
            map.put(c, true);
        }
        for (int i = 0; i < smallArray.length; i++) {
            if (!map.getOrDefault(smallArray[i], false)) {
                return false;
            }
        }
        return true;
    }

    /*
     * Nested loop solution
     * Time complexity: 0(M*N) with M and N are lengths of 2 arrays
     */
    static boolean isSubSet(Character[] array1, Character[] array2) {
        Character[] smallArray;
        Character[] largeArray;
        if (array1.length > array2.length) {
            smallArray = array2;
            largeArray = array1;
        } else {
            smallArray = array1;
            largeArray = array2;
        }
        for (int i = 0; i < smallArray.length; i++) {
            boolean foundMatched = false;
            for (int j = 0; j < largeArray.length; j++) {
                if (smallArray[i] == largeArray[j]) {
                    foundMatched = true;
                    break;
                }
            }
            if (!foundMatched) return false;
        }
        return true;
     }
}
