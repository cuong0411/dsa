package org.cuong.udemy.integers;

// https://leetcode.com/problems/reverse-integer/description/
public class ReverseInteger {

    /**
     * Reverses the digits of the given integer.
     * 
     * Approach:
     * The method iteratively extracts the last digit of the input integer `x` and
     * appends it to the result `res`.
     * It checks for overflow conditions before each append operation to ensure the
     * reversed integer does not exceed
     * the limits of a 32-bit signed integer. If an overflow condition is detected,
     * the method returns 0.
     * 
     * Time Complexity:
     * O(log10(n)) - The number of digits in the integer `x` determines the number
     * of iterations, which is proportional
     * to the logarithm of `x` to the base 10.
     * 
     * Space Complexity:
     * O(1) - The method uses a constant amount of space regardless of the input
     * size.
     * 
     * @param x the integer to be reversed
     * @return the reversed integer, or 0 if the reversed integer overflows
     */
    public int reverse(int x) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        if (x == max || x == min) {
            return 0;
        }
        int res = 0;
        while (x != 0) {
            if (res > max / 10 || res < min / 10) {
                return 0;
            }
            int lastDigit = x % 10;
            res = res * 10 + lastDigit;
            x /= 10;
        }
        return res;
    }

    public int reverse_mySolution(int x) {

        if (x == Integer.MIN_VALUE)
            return 0;

        int res = 0;
        boolean isNeg = x < 0;
        x = isNeg ? -x : x;
        while (x != 0) {
            if (res > (Integer.MAX_VALUE - x % 10) / 10) {
                return 0;
            }
            if (res < (Integer.MIN_VALUE + x % 10) / 10) {
                return 0;
            }
            res = res * 10 + x % 10;
            x /= 10;
        }
        return isNeg ? -res : res;
    }

}
