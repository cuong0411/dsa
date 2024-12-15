package org.cuong.udemy.integers;

// https://leetcode.com/problems/integer-to-roman/description/
public class IntegerToRoman {
    /**
     * Converts an integer to its Roman numeral representation.
     *
     * Approach:
     * The method uses a greedy algorithm to convert the integer to a Roman numeral.
     * It iterates over predefined arrays of integer values and their corresponding
     * Roman numeral strings.
     * For each integer value, it appends the corresponding Roman numeral to the
     * result string as many times as
     * the integer value can be subtracted from the input number. This process
     * continues until the input number
     * is reduced to zero.
     *
     * Time Complexity:
     * The time complexity is O(1) because the number of iterations is fixed and
     * does not depend on the size of
     * the input number. The maximum number of iterations is determined by the
     * number of elements in the arrays,
     * which is constant.
     *
     * Space Complexity:
     * The space complexity is O(1) as well, since the space used by the algorithm
     * does not depend on the size
     * of the input number. The space used is constant, primarily for the arrays and
     * the StringBuilder.
     *
     * @param num the integer to be converted, must be between 1 and 3999 inclusive.
     * @return a string representing the Roman numeral equivalent of the given
     *         integer.
     */
    public String intToRoman(int num) {
        // 1 <= num <= 3999
        if (num < 1 || num > 3999)
            return "";

        int[] storeInt = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] storeRoman = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < storeInt.length; i++) {
            while (num >= storeInt[i]) {
                sb.append(storeRoman[i]);
                num = num - storeInt[i];
            }
            if (num == 0)
                break;
        }
        return sb.toString();
    }

}
