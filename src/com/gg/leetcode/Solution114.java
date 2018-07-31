package com.gg.leetcode;

/**
 * Created by guowei on 2018/7/31.
 */
public class Solution114 {
    public void flatten(TreeNode root) {
        if (null == root || (null == root.left && null == root.right))
            return;
        if (null != root.left) {
            flatten(root.left);
            flatten(root.right);
            TreeNode tmp = root.right;
            root.right = root.left;
            root.left = null;
            TreeNode cur = root.right;
            while (null != cur.right) {
                cur = cur.right;
            }
            cur.right = tmp;
        }
        if (null == root.left) {
            flatten(root.right);
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
