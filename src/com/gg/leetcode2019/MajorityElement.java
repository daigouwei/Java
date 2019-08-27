package com.gg.leetcode2019;

//给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int cnt = nums.length / 2;
        for (int num : nums) {
            map.merge(num, 1, Integer::sum);
            if (map.get(num) > cnt) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int num = new MajorityElement().majorityElement(nums);
        System.out.println(num);
    }
}


