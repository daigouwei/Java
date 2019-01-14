package com.gg.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guowei
 * @date 2019/1/14
 */
public class Solution46 {
    private List<List<Integer>> resultList = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        permute(nums, new ArrayList<>());
        return resultList;
    }

    private void permute(int[] nums, List<Integer> list) {
        if (nums.length == list.size()) {
            resultList.add(new ArrayList<Integer>(list));
        }
        else {
            for (int num : nums) {
                if (!list.contains(num)) {
                    list.add(num);
                    permute(nums, list);
                    list.remove(list.size() - 1);
                }
            }
        }
    }
}
