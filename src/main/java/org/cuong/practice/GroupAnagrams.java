package org.cuong.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given an array of strings strs, group all anagrams together into sublists.
 * You may return the output in any order.
 * An anagram is a string that contains the exact same characters as another
 * string, but the order of the characters can be different.
 * Example 1:
 * Input: strs = ["act","pots","tops","cat","stop","hat"]
 * Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]
 * Example 2:
 * Input: strs = ["x"]
 * Output: [["x"]]
 * Example 3:
 * Input: strs = [""]
 * Output: [[""]]
 * Constraints:
 * 1 <= strs.length <= 1000.
 * 0 <= strs[i].length <= 100
 * strs[i] is made up of lowercase English letters.
 * 
 */
public class GroupAnagrams {

    /**
     * Groups an array of strings into sublists of anagrams using character
     * frequency as keys.
     *
     * @param strs an array of strings to be grouped into anagrams
     * @return a list of lists, where each sublist contains strings that are
     *         anagrams of each other
     * 
     *         Time Complexity: O(N * K), where N is the number of strings and K is
     *         the maximum length of a string.
     *         Counting each character in a string takes O(K) and we do this for
     *         each of the N strings.
     * 
     *         Space Complexity: O(N * K), where N is the number of strings and K is
     *         the maximum length of a string.
     *         The space is used to store the character frequency counts in the map.
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (var str : strs) { // length of array
            int[] count = new int[26]; // 26 lowercase letters in English
            for (var c : str.toCharArray()) { // max length of an individual string in array
                count[c - 'a'] += 1;
            }
            String key = Arrays.toString(count);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }

    /**
     * Groups an array of strings into sublists of anagrams using sorted character
     * arrays as keys.
     *
     * @param strs an array of strings to be grouped into anagrams
     * @return a list of lists, where each sublist contains strings that are
     *         anagrams of each other
     * 
     *         Time Complexity: O(N * K log K), where N is the number of strings and
     *         K is the maximum length of a string.
     *         Sorting each string takes O(K log K) and we do this for each of the N
     *         strings.
     * 
     *         Space Complexity: O(N * K), where N is the number of strings and K is
     *         the maximum length of a string.
     *         The space is used to store the sorted strings in the map.
     */
    public List<List<String>> groupAnagramsUseSort(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (var str : strs) {
            char[] arrayCharacter = str.toCharArray();
            Arrays.sort(arrayCharacter);
            String key = Arrays.toString(arrayCharacter);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }

}
