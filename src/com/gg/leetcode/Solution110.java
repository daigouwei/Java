package com.gg.leetcode;

/**
 * Created by guowei on 2018/7/30.
 */
public class Solution110 {
    public boolean isBalanced(TreeNode root) {
        if (null == root)
            return true;
        int left = getDeep(root.left);
        int right = getDeep(root.right);
        if (Math.abs(left - right) <= 1)
            return isBalanced(root.left) && isBalanced(root.right);
        else
            return false;
    }

    private int getDeep(TreeNode root) {
        if (null == root)
            return 0;
        int left = getDeep(root.left);
        int right = getDeep(root.right);
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
