package org.cuong.recursion;

/*
 * The Staircase Problem
 * Have a staircase of N steps, and a person has the ability to climb
 * one, two or three steps at a time. How many different possible 'paths'
 * can someone take to reach the top?
 */

public class StairCase {
    public static void main(String[] args) {
        System.out.println(numberOfPath(4));
    }

    static int numberOfPath(int n) {
        if (n < 0)
            return 0;
        if (n == 0 || n == 1)
            return 1;
        return numberOfPath(n - 1) + numberOfPath(n - 2) + numberOfPath(n - 3);
    }
}
