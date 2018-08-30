package com.gg.leetcode;

public class Solution27 {
    public static void main(String[] args) {
        Solution27 solution27 = new Solution27();
        solution27.removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2);
        System.out.println();
    }

    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            if (nums[left] == val) {
                if (nums[right] == val) {
                    right--;
                } else {
                    nums[left] = nums[right];
                    left++;
                    right--;
                }
            } else {
                left++;
            }
        }
        return left;
    }
}
