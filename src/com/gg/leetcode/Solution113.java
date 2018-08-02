package com.gg.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution113 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        pathSum(root, new ArrayList<Integer>(), lists, sum);
        return lists;
    }

    private void pathSum(TreeNode root, List<Integer> list, List<List<Integer>> lists, int sum) {
        if (null == root)
            return;
        list.add(root.val);
        if (null == root.left && null == root.right) {
            int val = 0;
            for (int num : list)
                val += num;
            if (val == sum)
                lists.add(list);
        } else {
            List<Integer> lefts = new ArrayList<Integer>() {
                {
                    addAll(list);
                }
            };
            pathSum(root.left, lefts, lists, sum);
            List<Integer> rights = new ArrayList<Integer>() {
                {
                    addAll(list);
                }
            };
            pathSum(root.right, rights, lists, sum);
        }
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
