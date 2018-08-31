package com.gg.leetcode;

import java.util.Arrays;

/**
 * Created by guowei on 2018/8/31.
 */
public class Solution16 {
    public static void main(String[] args) {
        Solution16 solution16 = new Solution16();
        System.out.println(solution16.threeSumClosest(new int[]{1, 2, 4, 8, 16, 32, 64, 128}, 82));
        System.out.println();
    }

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int len = nums.length;
        int min = nums[0] + nums[1] + nums[2];
        int max = nums[len - 1] + nums[len - 2] + nums[len - 3];
        for (int i = 0; i < len - 2; i++) {
            for (int j = i + 1; j < len - 1; j++) {
                for (int k = j + 1; k < len; k++) {
                    int val = nums[i] + nums[j] + nums[k];
                    if (val == target) {
                        return target;
                    }
                    else if (val < target) {
                        if (Math.abs(target - val) < Math.abs(target - min)) {
                            min = val;
                        }
                    }
                    else {
                        if (Math.abs(target - val) < Math.abs(target - max)) {
                            max = val;
                            break;
                        }
                    }
                }
            }
        }
        return Math.abs(target - min) <= Math.abs(target - max) ? min : max;
    }
}
