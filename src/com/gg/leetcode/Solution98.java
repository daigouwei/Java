package com.gg.leetcode;

/**
 * Created by guowei on 2018/7/29.
 */
public class Solution98 {
    public boolean isValidBST(TreeNode root) {
        if (null == root)
            return true;
        if (traverse(root.left, root.val, true) && traverse(root.right, root.val, false))
            return isValidBST(root.left) && isValidBST(root.right);
        else
            return false;
    }

    private boolean traverse(TreeNode root, int val, boolean isLeft) {
        if (null == root)
            return true;
        if (isLeft) {
            if (root.val < val) {
                return traverse(root.left, val, true) && traverse(root.right, val, true);
            }
            else
                return false;
        }
        else {
            if (root.val > val) {
                return traverse(root.left, val, false) && traverse(root.right, val, false);
            }
            else
                return false;
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
