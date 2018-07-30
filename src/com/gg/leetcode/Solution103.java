package com.gg.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by guowei on 2018/7/30.
 */
public class Solution103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (null == root)
            return new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> lists = new ArrayList<>();
        queue.offer(root);
        boolean isReverse = false;
        while (!queue.isEmpty()) {
            int len = queue.size();
            List<Integer> list = new ArrayList<Integer>();
            while (len-- > 0) {
                TreeNode tmp = queue.poll();
                list.add(tmp.val);
                if (null != tmp.left)
                    queue.offer(tmp.left);
                if (null != tmp.right)
                    queue.offer(tmp.right);
            }
            if (isReverse)
                Collections.reverse(list);
            lists.add(list);
            isReverse = !isReverse;
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
