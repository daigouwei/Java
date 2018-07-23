package com.gg.leetcode;

/**
 * Created by guowei on 2018/7/23.
 */
public class Solution14 {
    public static void main(String[] args) {
        String[] strs = new String[]{"flower", "flow", "floght"};
        String res = longestCommonPrefix(strs);
        System.out.println(res);
    }

    public static String longestCommonPrefix(String[] strs) {
        int minLen = 0;
        for (int i = 0; i < strs.length; i++) {
            if (0 == i)
                minLen = strs[i].length();
            else
                minLen = strs[i].length() < minLen ? strs[i].length() : minLen;
        }
        String prefix = "";
        char prefixChar = ' ';
        boolean flag = false;
        for (int i = 0; i < minLen; i++) {
            for (int j = 0; j < strs.length; j++) {
                if (0 == j)
                    prefixChar = strs[j].charAt(i);
                else {
                    if (strs[j].charAt(i) != prefixChar) {
                        flag = true;
                        break;
                    }
                }
            }
            if (flag)
                return prefix;
            else
                prefix += prefixChar;
        }
        return prefix;
    }
}
