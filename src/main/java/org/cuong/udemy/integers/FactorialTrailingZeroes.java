package org.cuong.udemy.integers;

// https://leetcode.com/problems/factorial-trailing-zeroes/description/
public class FactorialTrailingZeroes {

    /**
     * Calculates the number of trailing zeroes in the factorial of a given number.
     * 
     * The approach is based on counting the number of times 5 is a factor in the
     * numbers
     * from 1 to n. Each pair of 2 and 5 contributes to a trailing zero, and since
     * there
     * are always more 2s than 5s, the number of trailing zeroes is determined by
     * the number
     * of 5s. The method repeatedly divides n by 5 and adds the quotient to the
     * count,
     * effectively counting the multiples of 5, 25, 125, etc.
     *
     * @param n the integer for which the factorial's trailing zeroes are to be
     *          calculated.
     *          It should be a non-negative integer.
     * @return the number of trailing zeroes in the factorial of the given number.
     *
     *         Time Complexity: O(log5(n)), where n is the input number. This is
     *         because we divide n by 5
     *         repeatedly until n becomes less than 5.
     * 
     *         Space Complexity: O(1), as we are using a constant amount of space.
     */
    public int trailingZeroes(int n) {
        if (n < 5) {
            return 0;
        }

        int count = 0;
        while (n >= 5) {
            if (n / 5 > 0) {
                count += n / 5;
            }
            n = n / 5;
        }
        return count;
    }

    // solution provided by the udemy platform
    public int trailingZeroes_udemy(int n) {
        int curPowerOfFive = 5;
        int count = 0;
        while (n >= curPowerOfFive) {
            count += n / curPowerOfFive;
            curPowerOfFive *= 5;
        }
        return count;
    }

    // second approach, slightly more efficient than the first one but not as
    // efficient as the first one
    public int trailingZeroes2(int n) {
        if (n < 5) {
            return 0;
        }

        int count = 0;
        int temp;
        for (int i = 5; i <= n; i = i + 5) {
            temp = i;
            while (temp != 0 && temp % 5 == 0) {
                count++;
                temp = temp / 5;
            }
        }
        return count;
    }

    // the brute force approach, but with high time and space complexity
    // TC: O(n), SC: O(1), got overflow when n is large
    public int trailingZeroes_bruteForce(int n) {
        long fac = 1L;
        if (n == 0) {
            return 0;
        }
        for (int i = 1; i <= n; i++) {
            fac *= i;
        }

        int count = 0;
        System.out.println(fac);
        while (fac % 10 == 0) {
            count++;
            fac /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        var a = new FactorialTrailingZeroes();
        System.out.println(a.trailingZeroes_bruteForce(13));
    }

}
