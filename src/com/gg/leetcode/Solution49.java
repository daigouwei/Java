package com.gg.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by guowei on 2018/10/26.
 */
public class Solution49 {
    public static void main(String[] args) {
        Solution49 solution49 = new Solution49();
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        solution49.groupAnagrams(strs);
        System.out.println();
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (String str : strs) {
            List<Character> list = new ArrayList<Character>();
            for (int i = 0; i < str.length(); i++) {
                list.add(str.charAt(i));
            }
            String key = list.stream().sorted().map(Object::toString).collect(Collectors.joining());
            List<String> addNewList = new ArrayList<String>() {
                {
                    add(str);
                }
            };
            map.merge(key, addNewList, (inList, addList) -> {
                inList.addAll(addList);
                return inList;
            });
        }
        List<List<String>> resList = new ArrayList<>();
        map.forEach((k, v) -> resList.add(v));
        return resList;
    }
}
