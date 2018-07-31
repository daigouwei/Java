package com.gg.leetcode;

/**
 * Created by guowei on 2018/7/31.
 */
public class Solution230 {
    public int kthSmallest(TreeNode root, int k) {
        int num = countNode(root.left);
        if (num == k - 1)
            return root.val;
        if (num > k - 1)
            return kthSmallest(root.left, k);
        return kthSmallest(root.right, k - (num + 1));
    }

    private int countNode(TreeNode root) {
        if (null == root)
            return 0;
        return 1 + countNode(root.left) + countNode(root.right);
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
