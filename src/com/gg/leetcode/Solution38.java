package com.gg.leetcode;

/**
 * Created by guowei on 2018/9/8.
 */
public class Solution38 {
    public static void main(String[] args) {
        Solution38 solution38 = new Solution38();
        String res = solution38.countAndSay(3);
        System.out.println(res);
    }

    public String countAndSay(int n) {
        if (1 == n) {
            return "1";
        }
        String str = countAndSay(n - 1);
        int len = str.length();
        int cnt = 1;
        char pre = str.charAt(0);
        for (int i = 1; i < len; i++) {
            char cur = str.charAt(i);
            if (cur == pre) {
                cnt++;
            }
            else {
                str += cnt + pre;
                cnt = 1;
            }
            pre = cur;
        }
        return str;
    }
}
