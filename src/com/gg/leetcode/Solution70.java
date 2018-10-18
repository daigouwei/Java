package com.gg.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by guowei on 2018/10/18.
 */
public class Solution70 {
    private final Map<Integer, Integer> map = new HashMap<Integer, Integer>() {
        {
            put(1, 1);
            put(2, 2);
        }
    };

    public static void main(String[] args) {
        Solution70 solution70 = new Solution70();
        System.out.println(solution70.climbStairs(6));
        System.out.println();
    }

    public int climbStairs(int n) {
        if (1 == n) {
            return 1;
        }
        if (2 == n) {
            return 2;
        }
        int lastOne = climbStairs(n - 1);
        map.put(n - 1, lastOne);
        int lastTwo = map.get(n - 2);
        return lastOne + lastTwo;
    }
}
