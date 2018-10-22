package com.gg.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guowei on 2018/10/22.
 */
public class Solution119 {
    public static void main(String[] args) {
        new Solution119().getRow(5);
    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= rowIndex + 1; i++) {
            list.add(1);
            for (int j = i - 2; j > 0; j--) {
                list.set(j, list.get(j) + list.get(j - 1));
            }
        }
        return list;
    }
}
