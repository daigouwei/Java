package com.gg.leetcode;

/**
 * Created by guowei on 2018/10/22.
 */
public class Solution66 {
    public static void main(String[] args) {
        new Solution66().plusOne(new int[]{9, 9, 9});
    }

    public int[] plusOne(int[] digits) {
        int carry = 0;
        for (int len = digits.length, i = len - 1; i >= 0; i--) {
            if (i == len - 1) {
                digits[i] += 1;
            }
            else {
                digits[i] += carry;
            }
            if (digits[i] < 10) {
                return digits;
            }
            else {
                carry = 1;
                digits[i] = 0;
            }

        }
        if (0 == digits[0]) {
            int[] resDigits = new int[digits.length + 1];
            resDigits[0] = 1;
            for (int i = 0; i < digits.length; i++) {
                resDigits[i + 1] = digits[i];
            }
            return resDigits;
        }
        return digits;
    }
}
