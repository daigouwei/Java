package com.gg.leetcode;

/**
 * Created by guowei on 2018/7/29.
 */
public class Solution96 {
    public int numTrees(int n) {
        if (0 == n)
            return 1;
        int res = 0;
        for (int i = 0; i <= n - 1; i++) {
            res += numTrees(n - 1 - i) * numTrees(i);
        }
        return res;
    }
}
