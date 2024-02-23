package org.cuong.recursion;

public class Intro {
    public static void main(String[] args) {
        // printNumberInRerverse(10);
        // int[] numbers = { 1, 2, 3, 4 };
        // doubleNumberInArray(numbers, 0);
        // System.out.println(Arrays.toString(numbers));
        // System.out.println(sum(10));
        // System.out.println(reverseString("abcde"));
        System.out.println(countX("abcxyux"));
        System.out.println(countX_ver2("abcxyux"));
    }

    static int countX_ver2(String s) {
        if (s.length() == 0)
            return 0;
        if (s.charAt(0) == 'x') {
            return 1 + countX_ver2(s.substring(1));
        } else {
            return 0 + countX_ver2(s.substring(1));
        }
    }

    static int countX(String s) {
        if (s.length() == 1) {
            if (s.charAt(0) == 'x') {
                return 1;
            } else {
                return 0;
            }
        } else {
            return countX(s.substring(1)) + countX(String.valueOf(s.charAt(0)));
        }

    }

    static String reverseString(String s) {
        if (s.length() == 1)
            return String.valueOf(s.charAt(0));
        return reverseString(s.substring(1)) + String.valueOf(s.charAt(0));
    }

    static int sum(int n) {
        if (n == 1)
            return 1;
        return n + sum(n - 1);
    }

    static void doubleNumberInArray(int[] a, int index) {
        if (index >= a.length)
            return;
        a[index] *= 2;
        doubleNumberInArray(a, index + 1);
    }

    static void printNumberInRerverse(int n) {
        System.out.println(n);
        if (n == 0)
            return;
        printNumberInRerverse(n - 1);
    }
}
