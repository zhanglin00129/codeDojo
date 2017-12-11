package longestPalindrome;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Solution2Test {
    @Test
    public void getLongestPalindrome() throws Exception {
        Solution2 solution = new Solution2();
        assertThat(solution.longestPalindrome("cbccba"), is("bccb"));
        assertThat(solution.longestPalindrome("babad"), is("bab"));
        assertThat(solution.longestPalindrome("cbbd"), is("bb"));
        assertThat(solution.longestPalindrome("abcdcba"), is("abcdcba"));
    }

}