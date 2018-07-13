package com.gg.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guowei on 2018/7/13.
 */
public class Solution9 {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        if (x >= 0 && x < 10)
            return true;
        List<Integer> digits = new ArrayList<Integer>();
        while (x != 0) {
            digits.add(x % 10);
            x = x / 10;
        }
        for (int index = 0; index < digits.size() / 2; index++) {
            if (digits.get(index) != digits.get(digits.size() - 1 - index))
                return false;
        }
        return true;
    }
}
