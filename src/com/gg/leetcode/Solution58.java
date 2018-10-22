package com.gg.leetcode;

/**
 * Created by guowei on 2018/10/22.
 */
public class Solution58 {
    public int lengthOfLastWord(String s) {
        if (null == s) {
            return 0;
        }
        s = s.trim();
        if (0 == s.length()) {
            return 0;
        }
        return s.length() - s.lastIndexOf(" ") - 1;
    }
}
