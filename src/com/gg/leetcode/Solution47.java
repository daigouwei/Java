package com.gg.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author guowei
 * @date 2019/3/9
 */
public class Solution47 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2, 3};
        Solution47 solution47 = new Solution47();
        solution47.permuteUnique(nums);
        System.out.println();
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        permuteUnique(nums.length, new ArrayList<>(), resultList,
                Arrays.stream(nums).boxed().collect(Collectors.toList()));
        return resultList;
    }

    private void permuteUnique(int len, List<Integer> list, List<List<Integer>> lists, List<Integer> otherNums) {
        if (list.size() == len) {
            lists.add(new ArrayList<>(list));
            return;
        }
        otherNums.stream().distinct().forEach(otherNum -> {
            list.add(otherNum);
            List<Integer> otherNumList = new ArrayList<>(otherNums);
            otherNumList.remove((Integer) otherNum);
            permuteUnique(len, list, lists, otherNumList);
            list.remove(list.size() - 1);
        });
    }
}
