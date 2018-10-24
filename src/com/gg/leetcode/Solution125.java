package com.gg.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by guowei on 2018/10/24.
 */
public class Solution125 {
    public boolean isPalindrome(String s) {
        if (null == s || 0 == s.trim().length()) {
            return true;
        }
        char[] s2CharArr = s.toLowerCase().toCharArray();
        List<Character> charList = new ArrayList<>();
        for (char s2Char : s2CharArr) {
            if ((s2Char >= '0' && s2Char <= '9') || (s2Char >= 'a' && s2Char <= 'z')) {
                charList.add(s2Char);
            }
        }
        for (int i = 0; i < charList.size() / 2; i++) {
            if (!Objects.equals(charList.get(i), charList.get(charList.size() - 1 - i))) {
                return false;
            }
        }
        return true;
    }
}
