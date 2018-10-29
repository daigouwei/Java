package com.gg.leetcode;

/**
 * Created by guowei on 2018/10/29.
 */
public class Solution50 {
    public static void main(String[] args) {
        Solution50 solution50 = new Solution50();
        double sum = solution50.myPow(2.0, 10);
        System.out.println(sum);
    }

    public double myPow(double x, int n) {
        return myPow(x, n, n);
    }

    public double myPow(double x, int n, int realN) {
        if (0 == n) {
            return 1;
        }
        int remainder = Math.abs(n % 2);
        double sum = 0;
        if (0 == remainder) {
            sum = myPow(x, n / 2, realN);
            sum = sum * sum;
        }
        else {
            sum = myPow(x, n / 2, realN);
            sum = sum * sum * x;
        }
        if (n == realN) {
            return realN > 0 ? sum : 1 / sum;
        }
        return sum;
    }
}
