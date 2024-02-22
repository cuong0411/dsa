package org.cuong.string;

public class PalindromeChecker {
    public static void main(String[] args) {
        String[] s = { "racecar", "kayak", "deified", "demo", "test" };
        for (var i : s) {
            System.out.println(i + " is Palindrome word? " + check(i));
        }
    }

    static boolean check(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < s.length() / 2) {
            if (s.charAt(start) != (s.charAt(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
