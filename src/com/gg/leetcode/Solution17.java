package com.gg.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by guowei on 2018/8/31.
 */
public class Solution17 {
    Map<Character, Character[]> map = new HashMap<Character, Character[]>() {
        {
            put('2', new Character[]{'a', 'b', 'c'});
            put('3', new Character[]{'d', 'e', 'f'});
            put('4', new Character[]{'g', 'h', 'i'});
            put('5', new Character[]{'j', 'k', 'l'});
            put('6', new Character[]{'m', 'n', 'o'});
            put('7', new Character[]{'p', 'q', 'r', 's'});
            put('8', new Character[]{'t', 'u', 'v'});
            put('9', new Character[]{'w', 'x', 'y', 'z'});
        }
    };

    public static void main(String[] args) {
        Solution17 solution17 = new Solution17();
        List<String> list = solution17.letterCombinations("23");
        System.out.println();
    }

    public List<String> letterCombinations(String digits) {
        if (null == digits || 0 == digits.length()) {
            return Collections.EMPTY_LIST;
        }
        if (1 == digits.length()) {
            List<String> list = new ArrayList<String>();
            for (Character ch : this.map.get(digits.charAt(0))) {
                list.add(ch.toString());
            }
            return list;
        }
        List<String> list = letterCombinations(digits.substring(0, digits.length() - 1));
        Character digit = digits.charAt(digits.length() - 1);
        Character[] chs = this.map.get(digit);
        List<String> resList = new ArrayList<String>();
        for (Character ch : chs) {
            for (String str : list) {
                resList.add(str + ch);
            }
        }
        return resList;
    }
}
