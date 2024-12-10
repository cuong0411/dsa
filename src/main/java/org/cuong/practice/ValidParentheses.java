package org.cuong.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * You are given a string s consisting of the following characters: '(', ')',
 * '{', '}', '[' and ']'.
 * 
 * The input string s is valid if and only if:
 * 
 * Every open bracket is closed by the same type of close bracket.
 * Open brackets are closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 * 
 * Return true if s is a valid string, and false otherwise.
 * 
 * Example 1:
 * 
 * Input: s = "[]"
 * 
 * Output: true
 * 
 * Example 2:
 * 
 * Input: s = "([{}])"
 * 
 * Output: true
 * 
 * Example 3:
 * 
 * Input: s = "[(])"
 * 
 * Output: false
 * 
 * Explanation: The brackets are not closed in the correct order.
 * 
 * Constraints:
 * 
 * 1 <= s.length <= 1000
 * 
 * 
 */
public class ValidParentheses {
    /**
     * Determines if the input string of brackets is valid.
     * A string is considered valid if every open bracket is closed by the same type
     * of close bracket,
     * open brackets are closed in the correct order, and every close bracket has a
     * corresponding open bracket of the same type.
     *
     * @param s the input string consisting of characters '(', ')', '{', '}', '['
     *          and ']'
     * @return true if the string is valid according to the specified rules, false
     *         otherwise
     */
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (stack.isEmpty()) {
                return false;
            } else {
                if (map.get(c) != stack.pop()) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
