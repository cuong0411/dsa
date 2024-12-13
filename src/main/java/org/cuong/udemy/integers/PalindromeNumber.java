package org.cuong.udemy.integers;

// https://leetcode.com/problems/palindrome-number
public class PalindromeNumber {

    /**
     * Determines if a given integer is a palindrome without converting it to a
     * string.
     * This method checks if the integer reads the same forwards and backwards.
     *
     * @param x the integer to be checked for being a palindrome
     * @return true if the integer is a palindrome, false otherwise
     *
     *         Time Complexity: O(log10(n)), where n is the input number. This is
     *         because we are dividing the number by 10 in each iteration.
     *         Space Complexity: O(1), as we are using a constant amount of extra
     *         space.
     */
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        int res = 0;
        while (x > res) {
            res = res * 10 + x % 10;
            x = x / 10;
        }
        return x == res || (x == (res / 10));
    }

    /**
     * Determines if a given integer is a palindrome using a brute force approach.
     * This method converts the integer to a string and checks if the string is
     * the same when read forwards and backwards.
     *
     * @param x the integer to be checked for being a palindrome
     * @return true if the integer is a palindrome, false otherwise
     *
     *         Time Complexity: O(n), where n is the number of digits in the
     *         integer.
     *         This is because we iterate over half of the string representation of
     *         the integer.
     *
     *         Space Complexity: O(n), due to the space required to store the string
     *         representation of the integer.
     */
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
