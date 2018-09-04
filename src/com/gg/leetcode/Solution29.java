package com.gg.leetcode;

/**
 * Created by guowei on 2018/9/3.
 */
public class Solution29 {
    public static void main(String[] args) {
        Solution29 solution29 = new Solution29();
        System.out.println(solution29.divide(-1010369383, -2147));
        System.out.println(Integer.MAX_VALUE);
    }

    public int divide(int dividend, int divisor) {
        boolean isPositive = (dividend < 0) ^ (divisor > 0);
        long res = 0L;
        long m = dividend == Integer.MIN_VALUE ? (long) Integer.MAX_VALUE + 1 : (long) Math.abs(dividend);
        long n = divisor == Integer.MIN_VALUE ? (long) Integer.MAX_VALUE + 1 : (long) Math.abs(divisor);
        if (1L == n) {
            res = isPositive ? m : -m;
            return res <= Integer.MAX_VALUE && res >= Integer.MIN_VALUE ? (int) res : (int) (Integer.MAX_VALUE);
        }
        if (m < n) {
            return 0;
        }
        long val = 0L;
        while (m >= n) {
            long p = n;
            long q = 1L;
            while (m >= p) {
                q = q << 1;
                p = p << 1;
            }
            val += q >> 1;
            m = m - (p >> 1);
        }
        res = isPositive ? val : -val;
        return res <= Integer.MAX_VALUE && res >= Integer.MIN_VALUE ? (int) res : (int) (Integer.MAX_VALUE);
    }
}
