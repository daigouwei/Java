package com.gg.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by guowei on 2018/9/3.
 */
public class Solution18 {
    public static void main(String[] args) {
        Solution18 solution18 = new Solution18();
        //                int[] nums = {1, 0, -1, 0, -2, 2};
        int[] nums = {0, 0, 0, 0};
        //        int[] nums = {2, 0, 3, 0, 1, 2, 4};
        int target = 0;
        System.out.println(solution18.fourSum(nums, target));
        System.out.println();
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < nums.length - 3; i++) {
            if (!(0 == i || (0 != i && nums[i] != nums[i - 1]))) {
                continue;
            }
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (!(i + 1 == j || (i + 1 != j && nums[j] != nums[j - 1]))) {
                    continue;
                }
                int twoTarget = target - nums[i] - nums[j];
                int left = j + 1;
                int right = nums.length - 1;
                while (left < right) {
                    int actual = nums[left] + nums[right];
                    if (twoTarget == actual) {
                        List<Integer> usefulList = new ArrayList<Integer>();
                        usefulList.add(nums[i]);
                        usefulList.add(nums[j]);
                        usefulList.add(nums[left]);
                        usefulList.add(nums[right]);
                        lists.add(usefulList);
                        while (left < right && nums[left + 1] == nums[left]) {
                            left++;
                        }
                        left++;
                        while (right > left && nums[right - 1] == nums[right]) {
                            right--;
                        }
                        right--;
                    }
                    else if (twoTarget > actual) {
                        while (left < right && nums[left + 1] == nums[left]) {
                            left++;
                        }
                        left++;
                    }
                    else {
                        while (right > left && nums[right - 1] == nums[right]) {
                            right--;
                        }
                        right--;
                    }
                }
            }
        }
        return lists;
    }
}
