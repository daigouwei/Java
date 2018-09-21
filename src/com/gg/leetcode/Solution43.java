package com.gg.leetcode;

/**
 * Created by guowei on 2018/9/21.
 */
public class Solution43 {
    public static void main(String[] args) {
        Solution43 solution43 = new Solution43();
        System.out.println(solution43.multiply("123", "456"));
        System.out.println();
    }

    public String multiply(String num1, String num2) {
        char[] num1Arr = num1.toCharArray();
        char[] num2Arr = num2.toCharArray();
        int[] resArr = new int[num1Arr.length + num2Arr.length];
        StringBuilder resStr = new StringBuilder("");
        for (int i = num1Arr.length - 1; i >= 0; i--) {
            for (int j = num2Arr.length - 1; j >= 0; j--) {
                int digit1 = num1Arr[i] - '0';
                int digit2 = num2Arr[j] - '0';
                int res = digit1 * digit2 + resArr[i + j + 1];
                resArr[i + j + 1] = res % 10;
                resArr[i + j] += res / 10;
            }
        }
        for (int digit : resArr) {
            //过滤到开头的数字0
            if (0 != resStr.length() || 0 != digit) {
                resStr.append(digit);
            }
        }
        return 0 == resStr.length() ? "0" : resStr.toString();
    }
}
