package com.gg.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guowei on 2018/8/1.
 */
public class Solution129 {
    public int sumNumbers(TreeNode root) {
        int sum = 0;
        List<Integer> list = new ArrayList<Integer>();
        getPaths(root, 0, list);
        for (int num : list)
            sum += num;
        return sum;
    }

    private void getPaths(TreeNode root, int val, List<Integer> list) {
        if (null == root)
            return;
        val = val * 10 + root.val;
        if (null == root.left && null == root.right) {
            list.add(val);
            return;
        }
        if (null != root.left)
            getPaths(root.left, val, list);
        if (null != root.right)
            getPaths(root.right, val, list);
    }

    private List<Integer> getPaths(TreeNode root, int val) {
        if (null == root)
            return new ArrayList<Integer>();
        val = val * 10 + root.val;
        List<Integer> lefts = getPaths(root.left, val);
        List<Integer> rights = getPaths(root.right, val);
        lefts.addAll(rights);
        if (lefts.isEmpty() && rights.isEmpty())
            lefts.add(val);
        return lefts;
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
