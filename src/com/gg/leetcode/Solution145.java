package com.gg.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guowei on 2018/7/31.
 */
public class Solution145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        if (null == root)
            return new ArrayList<Integer>();
        List<Integer> lefts = postorderTraversal(root.left);
        List<Integer> rights = postorderTraversal(root.right);
        return new ArrayList<Integer>() {
            {
                addAll(lefts);
                addAll(rights);
                add(root.val);
            }
        };
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
