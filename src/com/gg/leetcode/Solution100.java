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

    private boolean isSame2(TreeNode p, TreeNode q) {
        if (null == p && null == q)
            return true;
        else if (null == p || null == q)
            return false;
        else if (p.val != q.val)
            return false;
        else {
            boolean isSameLeft = isSame2(p.left, q.left);
            boolean isSameRight = isSame2(p.right, q.right);
            return isSameLeft && isSameRight;
        }
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
