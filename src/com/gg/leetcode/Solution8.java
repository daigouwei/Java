package com.gg.leetcode;

/**
 * Created by guowei on 2018/8/29.
 */
public class Solution8 {
    public static void main(String[] args) {
        Solution8 solution8 = new Solution8();
        String str = "9223372036854775808";
        System.out.println(solution8.myAtoi(str));
    }

    public int myAtoi(String str) {
        long num = 0;
        boolean isPositive = true;
        boolean firstFlag = true;

        for (int i = 0; i < str.length(); i++) {
            if (firstFlag) {
                if (' ' == str.charAt(i)) {
                    continue;
                }
                else {
                    if ('+' == str.charAt(i) || '-' == str.charAt(i) || str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                        firstFlag = false;
                        if ('-' == str.charAt(i)) {
                            isPositive = false;
                        }
                        if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                            num = str.charAt(i) + 0 - '0';
                        }
                    }
                    else {
                        return 0;
                    }
                }
            }
            else {
                if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    num = 10 * num + str.charAt(i) + 0 - '0';
                    if(num>Integer.MAX_VALUE){
                        break;
                    }
                }
                else {
                    break;
                }
            }
        }
        if (!isPositive) {
            num = 0 - num;
            return num < Integer.MIN_VALUE ? Integer.MIN_VALUE : (int)num;
        }
        else {
            return num > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int)num;
        }
    }
}
