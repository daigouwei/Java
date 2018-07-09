package com.gg.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guowei on 2018/7/9.
 */
public class Solution7 {
    public static void main(String[] args) {
        int res = new Solution7().reverse(-2147483648);
        System.out.println(res);
    }

    public int reverse(int x) {
        if (0 == x)
            return x;
        List<Integer> digits = new ArrayList<Integer>();
        while (0 != x) {
            digits.add(x % 10);
            x = x / 10;
        }
        long num = 0L;
        for (int index = 0; index < digits.size(); index++) {
            num += digits.get(index) * Math.pow(10, digits.size() - 1 - index);
        }
        if (num > Math.pow(2, 31) - 1 || num < -Math.pow(2, 31))
            return 0;
        return (int) num;
    }
}
