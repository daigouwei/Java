package com.gg.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by guowei on 2018/9/10.
 */
public class Solution39 {
    public static void main(String[] args) {
        Solution39 solution39 = new Solution39();
        solution39.combinationSum(new int[]{2, 3, 6, 7}, 7);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        combinationSum(candidates, target, 0, new Stack<Integer>(), lists);
        return lists;
    }

    private void combinationSum(final int[] candidates, int target, int start, Stack<Integer> stack,
            List<List<Integer>> lists) {
        for (int i = start; i < candidates.length; i++) {
            if (target < 0) {
                return;
            }
            else if (target > 0) {
                stack.add(candidates[i]);
                combinationSum(candidates, target - candidates[i], i, stack, lists);
                stack.pop();
            }
            else {
                List<Integer> list = new ArrayList<Integer>(stack);
                lists.add(list);
                return;
            }
        }
    }
}
