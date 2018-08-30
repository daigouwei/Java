package com.gg.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Created by guowei on 2018/8/30.
 */
public class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<Integer> numList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Collections.sort(numList, (o1, o2) -> o1 - o2);
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < numList.size() - 2; i++) {
            if (0 != lists.size() && Objects.equals(numList.get(i), lists.get(lists.size() - 1).get(0))) {
                continue;
            }
            int two = -numList.get(i);
            int left = i + 1;
            int right = numList.size() - 1;
            while (left < right) {
                int val = numList.get(left) + numList.get(right);
                if (val == two) {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(numList.get(i));
                    list.add(numList.get(left));
                    list.add(numList.get(right));
                    lists.add(list);
                    int cur = numList.get(left);
                    while (cur == numList.get(left)) {
                        if (left + 1 < numList.size()) {
                            left++;
                        }
                        else {
                            break;
                        }
                    }
                }
                else if (val > two) {
                    right--;
                }
                else {
                    left++;
                }
            }
        }
        return lists;
    }
}
