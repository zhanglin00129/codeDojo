package longestPalindrome;

public class Solution2 {
    public String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        int strLen = s.length(), start = 0, end = 0;
        boolean[][] dp = new boolean[strLen][strLen];

        for (int i = 0; i < strLen; i++) {
            dp[i][i] = true;

            for (int j = 0; j < i; j++) {
                if (j + 1 == i) {
                    dp[j][i] = (s.charAt(j) == s.charAt(i));

                } else if (i > j + 1) {
                    dp[j][i] = (s.charAt(j) == s.charAt(i)) && dp[j + 1][i - 1];
                }

                if (dp[j][i] && (i - j > end - start)) {
                    start = j;
                    end = i;
                }
            }
        }

        return s.substring(start, end + 1);

    }
}
