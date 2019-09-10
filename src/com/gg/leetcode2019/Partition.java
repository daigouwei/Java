package com.gg.leetcode2019;

//给定一个字符串 s，将 s 分割成一些子串，使每个子串都是回文串。
//返回 s 所有可能的分割方案。

import java.util.ArrayList;
import java.util.List;

public class Partition {
    public List<List<String>> partition(String s) {
        List<List<String>> lists = new ArrayList<>();
        partition(lists, s, new ArrayList<>());
        return lists;
    }

    private void partition(List<List<String>> lists, String s, List<String> list) {
        if (s.length() == 0) {
            lists.add(new ArrayList<>(list));
            return;
        }
        for (int i = 1; i <= s.length(); i++) {
            String subS = s.substring(0, i);
            if (!isPlalindrome(subS)) {
                continue;
            }
            list.add(subS);
            partition(lists, s.substring(i, s.length()), list);
            list.remove(list.size() - 1);
        }
    }

    private boolean isPlalindrome(String s) {
        if (s.length() <= 1) {
            return true;
        }
        int head = 0;
        int tail = s.length() - 1;
        while (head < tail) {
            if (s.charAt(head) != s.charAt(tail)) {
                return false;
            }
            head++;
            tail--;
        }
        return true;
    }

    public static void main(String[] args) {
        Partition partition = new Partition();
        partition.partition("aab");
    }
}


