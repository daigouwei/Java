package com.gg.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guowei on 2018/7/23.
 */
public class Solution14 {
    public String longestCommonPrefix(String[] strs) {
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

    public String longestCommonPrefix2(String[] strs) {
        if (0 == strs.length)
            return "";
        for (String str : strs) {
            if (str.equals(""))
                return "";
        }
        List<String> list = new ArrayList<>();
        for (String str : strs) {
            list.add(str.substring(1));
        }
        String prefix = longestCommonPrefix2(list.toArray(new String[list.size()]));
        char standard = ' ';
        for (int i = 0; i < strs.length; i++) {
            if (0 == i) {
                standard = strs[i].charAt(0);
            }
            else {
                if (standard != strs[i].charAt(0))
                    return "";
            }
        }
        return standard + prefix;
    }
}
