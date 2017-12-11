package longestPalindrome;

/**
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 * <p>
 * Example:
 * Input: "babad"
 * Output: "bab"
 * <p>
 * Note: "aba" is also a valid answer.
 * <p>
 * Example:
 * <p>
 * Input: "cbbd"
 * Output: "bb"
 */
public class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        int maxLength = 0;
        int maxStart = 0;
        int strLen = s.length();

        for (int palindromeLength = 1; palindromeLength <= strLen; palindromeLength++) {
            for (int start = 0; start < strLen - palindromeLength; start++) {
                if (palindromeLength > maxLength && isPalindrome(s, start, start + palindromeLength - 1)) {
                    maxLength = palindromeLength;
                    maxStart = start;
                }
            }
        }
        return s.substring(maxStart, maxStart + maxLength);
    }

    private boolean isPalindrome(String s, int startIndex, int endIndex) {
        int left = startIndex;
        int right = endIndex;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
