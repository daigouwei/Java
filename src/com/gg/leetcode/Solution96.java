package com.gg.leetcode;

/**
 * Created by guowei on 2018/7/29.
 */
public class Solution96 {
    public static void main(String[] args) {
        System.out.println(new Solution96().numTrees(3));
    }

    public int numTrees(int n) {
        if (0 == n || 1 == n)
            return 1;
        int[] num = new int[n + 1];
        num[0] = 1;
        num[1] = 1;
        for (int i = 2; i <= n; i++)
            for (int j = 0; j <= i - 1; j++)
                num[i] += num[i - 1 - j] * num[j];
        return num[n];
    }
}
