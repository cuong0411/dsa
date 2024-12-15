package org.cuong.udemy.integers;

// https://leetcode.com/problems/powx-n/description/
public class PowXN {
    /**
     * Computes the power of a number using a recursive approach.
     *
     * Approach:
     * The method uses a recursive approach to compute the power of a number.
     * - If the exponent `n` is negative, it converts the problem to a positive
     * exponent by taking the reciprocal of the base `x`.
     * - It handles the special case where `n` is Integer.MIN_VALUE to avoid
     * overflow.
     * - If `n` is zero, it returns 1, as any number raised to the power of zero is
     * 1.
     * - If `n` is one, it returns `x`, as any number raised to the power of one is
     * the number itself.
     * - For even exponents, it reduces the problem size by computing `myPow(x * x,
     * n / 2)`.
     * - For odd exponents, it computes `x * myPow(x * x, n / 2)`.
     *
     * Time Complexity:
     * The time complexity of this approach is O(log n) because the exponent `n` is
     * halved in each recursive call.
     *
     * Space Complexity:
     * The space complexity is O(log n) due to the recursive call stack.
     *
     * @param x the base number to be raised to a power.
     * @param n the exponent to which the base number is raised. Can be negative.
     * @return the result of raising the base number to the given exponent.
     */
    public double myPow(double x, int n) {
        // handle Integer.MIN_VALUE case
        if (n == Integer.MIN_VALUE) {
            return x * myPow(x, n + 1);
        }
        if (n < 0) {
            n = -n; // may overflow with Integer.MIN_VALUE
            x = 1 / x;
        }
        if (n == 0)
            return 1;
        if (n == 1)
            return x;

        if (n % 2 == 0) {
            return myPow(x * x, n / 2);
        }
        return x * myPow(x * x, n / 2);
    }

    public double myPow_udemy(double x, int n) {
        long num = Math.abs((long) n);
        double result = 1.0;
        while (num != 0) {
            if (num % 2 == 1) {
                result = result * x;
                num = num - 1;
            }
            x = x * x;
            num = num / 2;
        }
        return num < 0 ? 1 / result : result;
    }

    public double myPow_mySolution(double x, int n) {
        if (n < 0) {
            n = -n; // overflow
            x = 1 / x;
        }
        if (n == 0)
            return 1;
        if (n == 1)
            return x;

        if (n % 2 == 0) {
            return myPow(x * x, n / 2);
        }
        return x * myPow(x * x, n / 2);
    }
}
