package org.cuong.udemy.integers;

// https://leetcode.com/problems/roman-to-integer/
public class RomainToInteger {
    /**
     * Converts a Roman numeral string to its integer representation.
     *
     * Approach:
     * The method uses a map to store the integer values of Roman numeral
     * characters.
     * It iterates through the string, converting each character to its integer
     * value.
     * If a character has a smaller value than the next character, it is subtracted
     * from the result.
     * Otherwise, it is added to the result. This handles the subtractive notation
     * used in Roman numerals.
     *
     * Time Complexity:
     * O(n), where n is the length of the string. The method processes each
     * character of the string once.
     *
     * Space Complexity:
     * O(1), as the space used by the map is constant and does not depend on the
     * input size.
     *
     * @param s the Roman numeral string to be converted. It is expected to be a
     *          valid Roman numeral
     *          consisting of the characters 'I', 'V', 'X', 'L', 'C', 'D', and 'M'.
     * @return the integer representation of the Roman numeral.
     */
    public int romanToInt_mySolution(String s) {
        java.util.Map<Character, Integer> map = new java.util.HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        int digit;
        for (int i = 0; i < s.length(); i++) {
            digit = map.get(s.charAt(i));
            if (i < s.length() - 1 && digit < map.get(s.charAt(i + 1))) {
                result -= digit;
            } else {
                result += digit;
            }
        }
        return result;
    }

}
