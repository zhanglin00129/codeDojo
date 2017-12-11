package lengthOfLongestSubstring;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class SolutionTest {
    @Test
    public void testLengthOfSubstring() throws Exception {
        Solution solution = new Solution();

        Assert.assertThat(solution.lengthOfLongestSubstring("abcabcbb"), is(3));
        Assert.assertThat(solution.lengthOfLongestSubstring("bbbbb"), is(1));
        Assert.assertThat(solution.lengthOfLongestSubstring("pwwkew"), is(3));
        Assert.assertThat(solution.lengthOfLongestSubstring("aaaabcdeba"), is(5));
        Assert.assertThat(solution.lengthOfLongestSubstring("baabcdeba"), is(5));
        Assert.assertThat(solution.lengthOfLongestSubstring("abcdefbcdea"), is(6));
        Assert.assertThat(solution.lengthOfLongestSubstring("abcdefg"), is(7));
    }
}