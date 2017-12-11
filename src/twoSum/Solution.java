package twoSum;

import java.util.HashMap;
import java.util.Map;

class Solution {

    int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> valueIndexMap = new HashMap<>();

        for (int i = 0; i < nums.length; ++i) {

            int matche = target - nums[i];
            if (valueIndexMap.containsKey(matche)) {
                return new int[]{valueIndexMap.get(matche), i};
            }
            valueIndexMap.put(nums[i], i);
        }
        return null;
    }

}
