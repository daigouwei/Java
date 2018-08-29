package com.gg.leetcode;

/**
 * Created by guowei on 2018/8/29.
 */
public class Solution6 {
    public String convert(String s, int numRows) {
        if (1 == numRows) {
            return s;
        }
        int len = s.length();
        int rule = 2 * numRows - 2;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            if (0 == i) {
                for (int j = 0; j <= len / rule; j++) {
                    if (j * rule < len) {
                        sb.append(s.charAt(j * rule));
                    }
                }
            }
            else if (numRows - 1 == i) {
                for (int j = 0; j <= len / rule; j++) {
                    if (j * rule + numRows - 1 < len) {
                        sb.append(s.charAt(j * rule + numRows - 1));
                    }
                }
            }
            else {
                for (int j = 0; j <= len / rule; j++) {
                    if (j * rule + i < len) {
                        sb.append(s.charAt(j * rule + i));
                    }
                    if (j * rule + i + (numRows - i - 1) * 2 < len) {
                        sb.append(s.charAt(j * rule + i + (numRows - i - 1) * 2));
                    }
                }
            }
        }
        return sb.toString();
    }
}
