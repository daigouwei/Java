package com.gg.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution102 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        if (null == root)
            return lists;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int cnt = queue.size();
            List<Integer> list = new ArrayList<Integer>();
            while (cnt-- != 0) {
                TreeNode cur = queue.poll();
                list.add(cur.val);
                if (null != cur.left)
                    queue.offer(cur.left);
                if (null != cur.right)
                    queue.offer(cur.right);
            }
            lists.add(list);
        }
        return lists;
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
