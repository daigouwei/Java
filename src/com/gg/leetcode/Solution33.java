package com.gg.leetcode;

/**
 * Created by guowei on 2018/9/5.
 */
public class Solution33 {
    public static void main(String[] args) {
        Solution33 solution33 = new Solution33();
        System.out.println(solution33.search(new int[]{4}, -1));
        System.out.println();
    }

    public int search(int[] nums, int target) {
        if (0 == nums.length) {
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;
        //找到数组中最大值
        while (left < right) {
            int middle = (left + right) / 2;
            if (nums[middle] > nums[left]) {
                left = middle;
            }
            else if (nums[middle] < nums[left]) {
                right = middle;
            }
            else {
                if (nums[left] > nums[right]) {
                    right = left;
                }
                else {
                    left = right;
                }
            }
        }
        int max = left;
        int maxVal = nums[left];
        //搜索目标值
        if (target >= nums[0] && target <= maxVal) {
            //目标值就在最左值和最大值之间
            return binarySearch(nums, 0, max, target);
        }
        else {
            if (nums.length > max) {
                //说明最大值右侧还有旋转数组
                return binarySearch(nums, max + 1, nums.length - 1, target);
            }
            else {
                //说明该数组就是递增的没有旋转
                return -1;
            }
        }
    }

    private int binarySearch(int[] nums, int left, int right, int target) {
        while (left <= right) {
            int middle = (left + right) / 2;
            if (nums[middle] == target) {
                return middle;
            }
            else if (nums[middle] > target) {
                right = middle - 1;
            }
            else {
                left = middle + 1;
            }
        }
        return -1;
    }
}
