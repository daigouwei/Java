package com.gg.leetcode;

/**
 * Created by guowei on 2018/7/24.
 */
public class Solution111 {
    public int minDepth(TreeNode root) {
        if (null == root)
            return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if (left != 0 && right != 0)
            return 1 + Math.min(left, right);
        else
            return left == 0 ? 1 + right : 1 + left;

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
