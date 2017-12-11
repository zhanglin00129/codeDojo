package addTwoNumbers;

import addTwoNumbers.Solution.ListNode;
import org.junit.Assert;
import org.junit.Test;

import static addTwoNumbers.Solution.ListNode.buildListNode;
import static org.hamcrest.core.Is.is;

public class SolutionTest {
    @Test
    public void testAddTwoNumbers() throws Exception {
        ListNode l1 = buildListNode(new int[]{2, 4, 3});
        ListNode l2 = buildListNode(new int[]{5, 6, 4});

        ListNode results = new Solution().addTwoNumbers(l1, l2);

        Assert.assertThat(results, is(buildListNode(new int[]{7, 0, 8})));
    }
}