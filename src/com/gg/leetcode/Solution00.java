package com.gg.leetcode;

/**
 * Created by guowei on 2018/7/22.
 */
public class Solution00 {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        t1.left = t2;
        t1.right = t3;
        travelTree(t1);
        System.out.println();
    }

    public static void travelTree(TreeNode root) {
        if (null == root)
            return;
        else {
            travelTree(root.left);
            travelTree(root.right);
        }
    }

    private static class TreeNode {
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
