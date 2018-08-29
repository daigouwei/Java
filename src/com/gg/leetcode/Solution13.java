package com.gg.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution13 {
    public int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<String, Integer>() {
            {
                put("M", 1000);
                put("CM", 900);
                put("D", 500);
                put("CD", 400);
                put("C", 100);
                put("XC", 90);
                put("L", 50);
                put("XL", 40);
                put("X", 10);
                put("IX", 9);
                put("V", 5);
                put("IV", 4);
                put("I", 1);
            }
        };
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - 1) {
                return num + map.get(s.charAt(i) + "");
            }
            if ("CM".equals(String.valueOf(s.charAt(i)) + String.valueOf(s.charAt(i + 1)))) {
                num += map.get("CM");
                i++;
            } else if ("CD".equals(String.valueOf(s.charAt(i)) + String.valueOf(s.charAt(i + 1)))) {
                num += map.get("CD");
                i++;
            } else if ("XC".equals(String.valueOf(s.charAt(i)) + String.valueOf(s.charAt(i + 1)))) {
                num += map.get("XC");
                i++;
            } else if ("XL".equals(String.valueOf(s.charAt(i)) + String.valueOf(s.charAt(i + 1)))) {
                num += map.get("XL");
                i++;
            } else if ("IX".equals(String.valueOf(s.charAt(i)) + String.valueOf(s.charAt(i + 1)))) {
                num += map.get("IX");
                i++;
            } else if ("IV".equals(String.valueOf(s.charAt(i)) + String.valueOf(s.charAt(i + 1)))) {
                num += map.get("IV");
                i++;
            } else {
                num += map.get(String.valueOf(s.charAt(i)));
            }
        }
        return num;
    }
}
