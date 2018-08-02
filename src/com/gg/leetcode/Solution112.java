package com.gg.leetcode;

public class Solution112 {
    public static void main(String[] args) {
        Solution112 s = new Solution112();
        TreeNode t1 = s.new TreeNode(1);
        TreeNode t2 = s.new TreeNode(2);
        t1.left = t2;
        boolean is = s.hasPathSum(t1, 1);
        System.out.println(is);
    }

    public boolean hasPathSum(TreeNode root, int sum) {
        return hasPathSum(root, 0, sum);
    }

    private boolean hasPathSum(TreeNode root, int val, int sum) {
        if (null == root)
            return false;
        if (null == root.left && null == root.right)
            return root.val + val == sum;
        return hasPathSum(root.left, root.val + val, sum) || hasPathSum(root.right, root.val + val, sum);
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
