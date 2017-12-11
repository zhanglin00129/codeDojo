package lengthOfLongestSubstring;

import java.util.HashMap;
import java.util.Map;

/**
 * Longest Substring Without Repeating Characters
 * Given a string, find the length of the longest substring without repeating characters.
 * Examples:
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * Given "bbbbb", the answer is "b", with the length of 1.
 * Given "pwwkew", the answer is "wke", with the length of 3.
 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int maxLen = 0, startIndex = 0;

        Map<Character, Integer> charIndexMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (repeatInSubstring(startIndex, charIndexMap, current)) {

                maxLen = Math.max(i - startIndex, maxLen);

                startIndex = charIndexMap.get(current) + 1;
                charIndexMap.put(current, i);
                continue;
            }

            charIndexMap.put(current, i);
            maxLen = Math.max(i - startIndex + 1, maxLen);
        }

        return maxLen;
    }

    private boolean repeatInSubstring(int startIndex, Map<Character, Integer> charIndexMap, char current) {
        return charIndexMap.containsKey(current) && charIndexMap.get(current) >= startIndex;
    }
}
