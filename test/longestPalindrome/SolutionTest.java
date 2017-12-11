package longestPalindrome;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SolutionTest {
    @Test
    public void getLongestPalindrome() throws Exception {
        Solution solution = new Solution();
        assertThat(solution.longestPalindrome("cbccba"), is("bccb"));
        assertThat(solution.longestPalindrome("babad"), is("bab"));
        assertThat(solution.longestPalindrome("cbbd"), is("bb"));
    }
}