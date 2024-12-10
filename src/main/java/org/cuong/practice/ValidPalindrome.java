package org.cuong.practice;

/**
 * The {@code ValidPalindrome} class provides methods to check if a given string
 * is a palindrome. A palindrome is a string that reads the same forward and
 * backward, ignoring case and non-alphanumeric characters.
 * 
 * <p>
 * Example usage:
 * 
 * <pre>
 * {@code
 * ValidPalindrome vp = new ValidPalindrome();
 * boolean result = vp.isPalindrome("A man, a plan, a canal: Panama");
 * }
 * </pre>
 * </p>
 */
public class ValidPalindrome {

    /**
     * Checks if the given string is a palindrome by considering only
     * alphanumeric characters and ignoring cases.
     * 
     * @param s the input string to check
     * @return {@code true} if the string is a palindrome, {@code false} otherwise
     * 
     *         Time Complexity: O(n), where n is the length of the string. Each
     *         character
     *         is processed once.
     * 
     *         Space Complexity: O(n), due to the storage of the filtered string.
     */
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (var c : s.toCharArray()) {
            if ((c >= 97 && c <= 122) || (c >= 48 && c <= 57)) {
                sb.append(c);
            } else if (c >= 65 && c <= 90) {
                sb.append((char) (c + 32));
            }
        }
        String newStr = sb.toString();
        System.out.println(newStr);

        int start = 0;
        int end = newStr.length() - 1;
        while (start < end) {
            if (newStr.charAt(start) != newStr.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    /**
     * Checks if the given string is a palindrome by considering only
     * alphanumeric characters and ignoring cases. This method uses two pointers
     * to compare characters from both ends of the string.
     * 
     * @param s the input string to check
     * @return {@code true} if the string is a palindrome, {@code false} otherwise
     * 
     *         Time Complexity: O(n), where n is the length of the string. Each
     *         character
     *         is processed at most once.
     * 
     *         Space Complexity: O(1), as no additional space proportional to the
     *         input
     *         size is used.
     */
    public boolean isPalindrome2(String s) {
        if (s.isEmpty())
            return true;

        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }
            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    /**
     * Main method to test the palindrome checking methods.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        String s = "Was it a car or a cat I saw?";
        s = "0P";
        System.out.println(new ValidPalindrome().isPalindrome2(s));
    }
}