package org.cuong.practice;

import java.util.HashMap;
import java.util.Map;

// https://neetcode.io/problems/is-anagram

/**
 * Given two strings s and t, return true if the two strings
 * are anagrams of each other, otherwise return false
 * An anagram is a string that contains the exact same characters
 * as another string, but the order of the characters can be different.
 * 
 * Example 1:
 * Input: s = "racecar", t = "carrace"
 * Output: true
 * 
 * Example 2:
 * Input: s = "jar", t = "jam"
 * Output: false
 * Constraints:
 * s and t consist of lowercase English letters.
 */
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        // Time complexity: O(n) with n is the length of the string.
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
        }

        // Time complexity is O(1) because there are 26 lowercase letters in English.
        // Space complexity is O(1) because the space used by the map is constant
        // and does not depend on the size of the input strings.
        for (var i : map.values()) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isAnagramByNeetcode(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int val : count) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }

}
