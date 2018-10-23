package com.gg.leetcode;

/**
 * Created by guowei on 2018/10/22.
 */
public class Solution69 {
    public int mySqrt(int x) {
        long r = x;
        while (r * r > x) {
            r = (r + x / r) / 2;
        }
        return (int) r;
    }
}
