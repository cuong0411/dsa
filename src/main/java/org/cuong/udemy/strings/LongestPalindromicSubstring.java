package org.cuong.udemy.strings;

// https://leetcode.com/problems/longest-palindromic-substring/
class LongestPalindromicSubstring {
    int start = 0;
    int end = 0;
    // TC: O(n^2), SC: O(1)
    public String longestPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            expandAroundCenter(s, i, i);
            expandAroundCenter(s, i, i + 1);
        }
        return s.substring(start, end+1);
    }
    private void expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        left++;
        right--;
        if (end - start + 1 < right -left + 1) {
            start = left;
            end = right;
        }
    }

    public String longestPalindrome_mySolution(String s) {
        int i = s.length();
        String res = "";
        while (i >= 0) {
            for (int j = 0; j <= s.length() - i; j++) {
                res = s.substring(j, j+i);
                if (isPalindrome(res)) return res;
            }
            i--;
        }
        return res;

    }
    public static boolean isPalindrome(String s) {
        if (s.length() == 1) return true;
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}