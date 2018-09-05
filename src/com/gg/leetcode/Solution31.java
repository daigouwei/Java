package com.gg.leetcode;

/**
 * Created by guowei on 2018/9/5.
 */
public class Solution31 {
    public static void main(String[] args) {
        Solution31 solution31 = new Solution31();
        int[] nums = new int[]{1, 2, 3};
        solution31.nextPermutation(nums);
        System.out.println();
    }

    public void nextPermutation(int[] nums) {
        if (nums.length <= 1) {
            return;
        }
        if (2 == nums.length) {
            swap(nums, 0, 1);
            return;
        }
        int indexOne = -1;
        int indexTwo = -1;
        boolean isNormal = false;
        for (int i = nums.length - 1; i >= 1; i--) {
            if (nums[i - 1] < nums[i]) {
                indexOne = i - 1;
                isNormal = true;
                break;
            }
        }
        if (isNormal) {
            for (int i = nums.length - 1; i > indexOne; i--) {
                if (nums[i] > nums[indexOne]) {
                    indexTwo = i;
                    break;
                }
            }
            swap(nums, indexOne, indexTwo);
            swapRange(nums, indexOne + 1, nums.length - 1);
            return;
        }
        else {
            swapRange(nums, 0, nums.length - 1);
            return;
        }
    }

    private void swap(int[] nums, int indexOne, int indexTwo) {
        if (indexOne >= 0 && indexOne < nums.length && indexTwo >= 0 && indexTwo < nums.length
                && indexOne <= indexTwo) {
            int tmp = nums[indexOne];
            nums[indexOne] = nums[indexTwo];
            nums[indexTwo] = tmp;
        }
        else {
            return;
        }
    }

    private void swapRange(int[] nums, int fromIndex, int toIndex) {
        if (fromIndex < 0 || fromIndex >= nums.length || toIndex < 0 || toIndex >= nums.length || fromIndex > toIndex) {
            return;
        }
        for (int i = fromIndex; i <= (toIndex + fromIndex) / 2; i++) {
            swap(nums, i, fromIndex + toIndex - i);
        }
    }
}
