package com.gg.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guowei on 2018/7/29.
 */
public class Solution108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (0 == nums.length)
            return null;
        List<Integer> numList = new ArrayList<Integer>();
        for (int num : nums) {
            numList.add(num);
        }
        return sotredArrayToBST(numList);
    }

    private TreeNode sotredArrayToBST(List<Integer> list) {
        if (0 == list.size()) {
            return null;
        }
        if (1 == list.size()) {
            return new TreeNode(list.get(0));
        }
        int mid = list.size() / 2;
        TreeNode root = sotredArrayToBST(new ArrayList<Integer>() {{
            add(list.get(mid));
        }});
        root.left = sotredArrayToBST(list.subList(0, mid));
        root.right = sotredArrayToBST(list.subList(mid + 1, list.size()));
        return root;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
}
