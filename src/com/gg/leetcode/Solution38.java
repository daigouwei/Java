package com.gg.leetcode;

/**
 * Created by guowei on 2018/9/8.
 */
public class Solution38 {
    public static void main(String[] args) {
        Solution38 solution38 = new Solution38();
        String res = solution38.countAndSay(4);
        System.out.println(res);
    }

    public String countAndSay(int n) {
        if (1 == n) {
            return "1";
        }
        String str = countAndSay(n - 1);
        int len = str.length();
        int cnt = 0;
        String res = "";
        for (int i = 0; i < len; i++) {
            cnt++;
            char cur = str.charAt(i);
            if (i == len - 1) {
                res = (res + cnt) + cur;
                break;
            }
            char next = str.charAt(i + 1);
            if (cur != next) {
                res = (res + cnt) + cur;
                cnt = 0;
            }
        }
        return res;
    }
}
