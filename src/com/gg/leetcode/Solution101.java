package com.gg.leetcode;

/**
 * Created by guowei on 2018/7/24.
 */
public class Solution101 {
    public boolean isSymmetric(TreeNode root) {
        if (null == root)
            return true;
        return isTwoTreeSymmetric(root.left, root.right);
    }

    private boolean isTwoTreeSymmetric(TreeNode p, TreeNode q) {
        if (null == p && null == q)
            return true;
        if (null == p || null == q)
            return false;
        if (p.val != q.val)
            return false;
        boolean isSymmetric1 = isTwoTreeSymmetric(p.left, q.right);
        boolean isSymmetric2 = isTwoTreeSymmetric(p.right, q.left);
        return isSymmetric1 && isSymmetric2;
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
