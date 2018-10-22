package com.gg.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guowei on 2018/10/22.
 */
public class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= numRows; i++) {
            list.add(1);
            for (int j = i - 2; j > 0; j--) {
                list.set(j, list.get(j) + list.get(j - 1));
            }
            lists.add(new ArrayList<>(list));
        }
        return lists;
    }
}
