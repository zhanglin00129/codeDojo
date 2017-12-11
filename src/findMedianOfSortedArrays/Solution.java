package findMedianOfSortedArrays;

/**
 * Description
 * <p>
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * <p>
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 * <p>
 * Example 1:
 * <p>
 * nums1 = [1, 3]
 * nums2 = [2]
 * <p>
 * The median is 2.0
 * <p>
 * Example 2:
 * <p>
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * <p>
 * The median is (2 + 3)/2 = 2.5
 */
public class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int len = nums1.length + nums2.length;
        if (len % 2 == 0) {
            return (findKth(nums1, 0, nums2, 0, len / 2) + findKth(nums1, 0, nums2, 0, len / 2 + 1)) / 2;
        }

        return findKth(nums1, 0, nums2, 0, len / 2 + 1);
    }

    private double findKth(int[] nums1, int start1, int[] nums2, int start2, int k) {
        if (nums1.length <= start1) {
            return nums2[start2 + k - 1];
        }

        if (nums2.length <= start2) {
            return nums1[start1 + k - 1];
        }

        if (k == 1) {
            return Math.min(nums1[start1], nums2[start2]);
        }

        if (nums1[start1] < nums2[start2]) {
            return findKth(nums1, ++start1, nums2, start2, --k);
        }

        return findKth(nums2, ++start2, nums1, start1, --k);
    }
}
