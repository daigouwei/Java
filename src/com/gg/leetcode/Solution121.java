package com.gg.leetcode;

/**
 * Created by guowei on 2018/10/24.
 */
public class Solution121 {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for (int price : prices) {
            min = Math.min(min, price);
            profit = Math.max(profit, price - min);
        }
        return profit;
    }
}
