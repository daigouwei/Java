package com.gg.leetcode;

public class Solution26 {
    public static void main(String[] args) {
        Solution26 solution26 = new Solution26();
        solution26.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4});
        System.out.println();
    }

    public int removeDuplicates(int[] nums) {
        if (0 == nums.length) {
            return 0;
        }
        if (1 == nums.length) {
            return 1;
        }
        int i = 0;
        int j = 1;
        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                j++;
            } else {
                nums[++i] = nums[j];
            }
        }
        return i + 1;
    }
}
