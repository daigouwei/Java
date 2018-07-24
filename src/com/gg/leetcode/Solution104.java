package com.gg.leetcode;

/**
 * Created by guowei on 2018/7/24.
 */
public class Solution104 {
    public int maxDepth(TreeNode root) {
        if (null == root)
            return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return 1 + Math.max(left, right);
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
