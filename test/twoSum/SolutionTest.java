package twoSum;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testTwoSumSolution() throws Exception {
        int[] results = new Solution().twoSum(new int[]{2, 7, 11, 15}, 9);

        Assert.assertArrayEquals(new int[]{0,1}, results);
    }
}