package findMedianOfSortedArrays;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class SolutionTest {

    @Test
    public void getMedianOfSortedArrays() throws Exception {
        Solution solution = new Solution();

        Assert.assertThat(solution.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}), is(2d));
        Assert.assertThat(solution.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}), is(2.5d));
        Assert.assertThat(solution.findMedianSortedArrays(
                new int[]{1, 2, 3, 4, 5, 8, 9, 15, 16}, new int[]{3, 4, 5, 6, 7, 8, 9, 10, 11, 12}), is(7d));
    }
}