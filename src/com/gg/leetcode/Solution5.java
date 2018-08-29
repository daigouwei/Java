package com.gg.leetcode;

/**
 * Created by guowei on 2018/8/29.
 */
public class Solution5 {
    private int len = 0;
    private String str = "";

    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            longestPalindrome(s, i, i);
            longestPalindrome(s, i, i + 1);
        }
        return this.str;
    }

    private void longestPalindrome(String s, int low, int high) {
        while (low >= 0 && high <= s.length() - 1) {
            char left = s.charAt(low);
            char right = s.charAt(high);
            if (left == right) {
                if (high - low + 1 > len) {
                    len = high - low + 1;
                    str = s.substring(low, high + 1);
                }
                low--;
                high++;
            }
            else {
                break;
            }
        }
    }
}
