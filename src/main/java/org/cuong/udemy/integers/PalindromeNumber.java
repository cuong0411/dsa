package org.cuong.udemy.integers;

// https://leetcode.com/problems/palindrome-number
public class PalindromeNumber {

    // without converting the integer to a string
    public boolean isPalindrome(int x) {
        return true;
    }

    public boolean isPalindromeBruteForce(int x) {
        String s = String.valueOf(x);
        if (s.length() == 1)
            return true;

        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
