package addTwoNumbers;

/**
 * You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 465+342=807
 * Output: 7 -> 0 -> 8
 */

public class Solution {

    public static class ListNode {
        private Integer val;
        private ListNode next;

        public ListNode(Integer val) {
            this.val = val;
        }

        public static ListNode buildListNode(int[] nums) {
            ListNode head = new ListNode(nums[0]);
            ListNode current = head;
            for (int i = 1; i < nums.length; i++) {
                current.next = (new ListNode(nums[i]));
                current = current.next;

            }
            return head;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            ListNode listNode = (ListNode) o;

            if (val != null ? !val.equals(listNode.val) : listNode.val != null) {
                return false;
            }
            return next != null ? next.equals(listNode.next) : listNode.next == null;
        }

        @Override
        public int hashCode() {
            int result = val != null ? val.hashCode() : 0;
            result = 31 * result + (next != null ? next.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(this.val));
            ListNode current = this.next;

            while (current != null) {
                stringBuilder.append(",").append(current.val);
                current = current.next;
            }

            return stringBuilder.toString();
        }
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode emptyHead = new ListNode(0);
        ListNode current = emptyHead;
        int sum = 0;

        while (l1 != null || l2 != null) {
            sum = sum / 10;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            current.next = new ListNode(sum % 10);
            current = current.next;
        }

        if (sum / 10 > 0) {
            current.next = new ListNode(sum / 10);
        }
        return emptyHead.next;
    }

}
