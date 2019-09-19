package com.gg.leetcode2019;

//给定一个非空字符串 s 和一个包含非空单词列表的字典 wordDict，判定 s 是否可以被空格拆分为一个或多个在字典中出现的单词。
//说明：
//拆分时可以重复使用字典中的单词。
//你可以假设字典中没有重复的单词。

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        return wordBreak(s, wordDict, new ArrayList<>(), new HashMap<>());
    }

    private boolean wordBreak(String s, List<String> wordDict, List<String> list, Map<String, Boolean> map) {
        if (s.length() == 0) {
            return true;
        }
        for (int i = 1; i <= s.length(); i++) {
            String subS = s.substring(0, i);
            if (!wordDict.contains(subS)) {
                continue;
            }
            list.add(subS);
            String nextSubS = s.substring(i, s.length());
            boolean isWordBreak = false;
            if (map.containsKey(nextSubS)) {
                isWordBreak = map.get(nextSubS);
            } else {
                isWordBreak = wordBreak(nextSubS, wordDict, list, map);
                map.put(nextSubS, isWordBreak);
            }
            if (!isWordBreak) {
                list.remove(list.size() - 1);
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("a");
        wordDict.add("aa");
        wordDict.add("aaa");
        wordDict.add("aaaa");
        wordDict.add("aaaaa");
        System.out.println(new WordBreak().wordBreak(s, wordDict));
    }
}
