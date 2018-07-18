package com.gg.leetcode;

/**
 * Created by guowei on 2018/7/17.
 */
public class Solution100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return isSame(p, q);
    }

    private boolean isSame(TreeNode p, TreeNode q) {
        if (null == p && null == q)
            return true;
        if (null == p || null == q)
            return false;
        if (p.val != q.val)
            return false;
        return isSame(p.left, q.left) && isSame(p.right, q.right);
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int x) {
            this.val = x;
            this.left = null;
            this.right = null;
        }
    }
}
