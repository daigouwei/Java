package com.gg.leetcode;

/**
 * Created by guowei on 2018/7/31.
 */
public class Solution235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (null == root)
            return null;
        while (null != root) {
            if (p.val < root.val && q.val < root.val)
                root = root.left;
            if (p.val > root.val && q.val > root.val)
                root = root.right;
            else
                return root;
        }
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
