package com.gg.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public static void main(String[] args) throws Exception {
        int[] res = new Solution1().twoSum(new int[]{2, 3, 2, 5}, 4);
        System.out.println(res);
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> tmpMap = new HashMap<>();
        for (int index = 0; index < nums.length; index++) {
            int otherNum = target - nums[index];
            if (tmpMap.containsKey(otherNum)) {
                return new int[]{tmpMap.get(otherNum), index};
            } else {
                tmpMap.put(nums[index], index);
            }
        }
        return null;
    }
}
