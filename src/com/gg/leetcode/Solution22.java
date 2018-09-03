package com.gg.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guowei on 2018/9/3.
 */
public class Solution22 {
    public static void main(String[] args) {
        Solution22 solution22 = new Solution22();
        List<String> list = solution22.generateParenthesis(3);
        System.out.println();
    }

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        generateParenthesis(n, n, list, "");
        return list;
    }

    private void generateParenthesis(int left, int right, List<String> list, String str) {
        if (0 == left && 0 == right) {
            list.add(str);
            return;
        }
        if (0 != right && right > left) {
            generateParenthesis(left, right - 1, list, str + ")");
        }
        if (0 != left) {
            generateParenthesis(left - 1, right, list, str + "(");
        }
    }
}
