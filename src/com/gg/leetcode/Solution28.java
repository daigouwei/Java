package com.gg.leetcode;

import java.util.Objects;

public class Solution28 {
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        new Solution28().strStr(haystack, needle);
        System.out.println();
    }

    public int strStr(String haystack, String needle) {
        if (null == haystack || null == needle || haystack.length() < needle.length()) {
            return -1;
        }
        if (Objects.equals(needle, "")) {
            return 0;
        }
        int cnt = -1;
        for (char ch : haystack.toCharArray()) {
            cnt++;
            if (ch == needle.charAt(0)) {
                if (cnt + needle.length() <= haystack.length()) {
                    if (haystack.substring(cnt, cnt + needle.length()).equals(needle)) {
                        return cnt;
                    }
                } else {
                    return -1;
                }
            }
        }
        return -1;
    }
}
