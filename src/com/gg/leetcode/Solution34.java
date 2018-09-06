package com.gg.leetcode;

/**
 * Created by guowei on 2018/9/6.
 */
public class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        if (0 == nums.length) {
            return new int[]{-1, -1};
        }
        int left = 0;
        int right = nums.length - 1;
        int mid = -1;
        boolean isExist = false;
        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] == target) {
                isExist = true;
                break;
            }
            else if (nums[mid] > target) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        if (!isExist) {
            return new int[]{-1, -1};
        }
        else {
            int from = mid;
            int to = mid;
            while (from - 1 >= 0) {
                if (nums[from - 1] == target) {
                    from--;
                }
                else {
                    break;
                }
            }
            while (to + 1 <= nums.length - 1) {
                if (nums[to + 1] == target) {
                    to++;
                }
                else {
                    break;
                }
            }
            return new int[]{from, to};
        }
    }
}
