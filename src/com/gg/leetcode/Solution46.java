package com.gg.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guowei
 * @date 2019/1/14
 */
public class Solution46 {
    public static void main(String[] args) {
        Solution46 solution46 = new Solution46();
        solution46.permute(new int[]{1, 2,3});
        System.out.println();
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resultList1 = new ArrayList<>();
        permute(nums, resultList1, nums.length);
        List<List<Integer>> resultList2 = new ArrayList<>();
        permute(nums, resultList2, new ArrayList<>());
        return resultList2;
    }

    //DFS
    private void permute(int[] nums, List<List<Integer>> lists, List<Integer> list) {
        if (nums.length == list.size()) {
            lists.add(new ArrayList<Integer>(list));
        }
        else {
            for (int num : nums) {
                if (!list.contains(num)) {
                    list.add(num);
                    permute(nums, lists, list);
                    list.remove(list.size() - 1);
                }
            }
        }
    }

    //BFS
    private void permute(int[] nums, List<List<Integer>> lists, int index) {
        if (index == 0) {
            return;
        }
        if (index == 1) {
            for (int num : nums) {
                lists.add(new ArrayList<Integer>() {
                    {
                        add(num);
                    }
                });
            }
            return;
        }
        permute(nums, lists, index - 1);
        List<List<Integer>> listList = new ArrayList<>();
        for (List<Integer> list : lists) {
            for (int num : nums) {
                if (!list.contains(num)) {
                    List<Integer> tmpList = new ArrayList<>(list);
                    tmpList.add(num);
                    listList.add(tmpList);
                }
            }
        }
        lists.clear();
        lists.addAll(listList);
    }
}
