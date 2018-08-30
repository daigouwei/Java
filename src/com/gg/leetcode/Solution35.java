package com.gg.leetcode;

public class Solution35 {
    public int searchInsert(int[] nums, int target) {
        if (target < nums[0]) {
            return 0;
        }
        if (nums.length == 1) {
            return target <= nums[0] ? 0 : 1;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == target) {
                return i;
            }
            if (nums[i + 1] == target) {
                return i + 1;
            }
            if (nums[i] < target && nums[i + 1] > target) {
                return i + 1;
            }
        }
        return nums.length;
    }
}
