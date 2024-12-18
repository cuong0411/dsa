package org.cuong.udemy.strings;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] a = new int[26];
        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i) - 'a'] += 1;
            a[t.charAt(i) - 'a'] -= 1;
        }
        for (var i : a) {
            if (i != 0)
                return false;
        }
        return true;
    }
}
