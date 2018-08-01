package com.gg.leetcode;

/**
 * Created by guowei on 2018/8/1.
 */
public class Solution236 {
    /**
     * 思路：这里有一个隐藏信息就是单个结点的公共祖先就是自己，
     * 所以可以根据左右子树来遍历，通过左右子树的返回值是否为空来判断是单个结点还是两个结点，
     * 如果是左右都有单个结点，则返回root；如果左子树两个结点，则返回左子树的返回值；右子树类似；如果左右都没有结点，则返回空。
     *
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (null == root || p == root || q == root)
            return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (null != left && null != right)
            return root;
        return null == left ? right : left;
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
