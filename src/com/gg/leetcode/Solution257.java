package com.gg.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guowei on 2018/7/31.
 */
public class Solution257 {
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null)
            return new ArrayList<String>();
        List<String> lefts = binaryTreePaths(root.left);
        List<String> rights = binaryTreePaths(root.right);
        List<String> list = new ArrayList<String>();
        for (String left : lefts) {
            list.add(root.val + "->" + left);
        }
        for (String right : rights) {
            list.add(root.val + "->" + right);
        }
        if (list.isEmpty())
            list.add("" + root.val);
        return list;
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
