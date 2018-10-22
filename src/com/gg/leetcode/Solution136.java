package com.gg.leetcode;

/**
 * Created by guowei on 2018/10/22.
 */
public class Solution136 {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }
}
