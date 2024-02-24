package org.cuong.recursion;

import java.util.HashMap;
import java.util.Map;

/*
 * The Fibonacci sequence is a mathematical sequence of numbers
 * that begin with the numbers 0 and 1, and each subsequent number
 * is the sum of the previous two numbers of the sequence.
 * ex: 0, 1, 1, 2, 3, 5, 8, 13, ...
 */

public class Fibonacci {
    public static void main(String[] args) {

        // System.out.println(fib(7));

        // Map<Integer, Integer> memo = new HashMap<>();
        // System.out.println(fib(7, memo));
        // System.out.println(memo);

        System.out.println(fibLoop(7));
    }

    /*
     * Implement memoization
     * O(N)
     */
    static int fib(int n, Map<Integer, Integer> memo) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (memo.get(n) == null) {
            memo.put(n, fib(n - 2, memo) + fib(n - 1, memo));
        }
        return memo.get(n);
    }

    /*
     * overlapping subproblems
     * O(2^N)
     */
    static int fib(int n) {
        if (n == 0 || n == 1)
            return n;
        return fib(n - 2) + fib(n - 1);

    }

    static int fibLoop(int n) {
        if (n == 0)
            return 0;
        int a = 0;
        int b = 1;
        int temp;
        for (int i = 2; i <= n; i++) {
            temp = a;
            a = b;
            b = temp + a;
        }
        return b;
    }
}
