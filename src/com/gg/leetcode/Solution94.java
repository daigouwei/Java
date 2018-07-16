package com.gg.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by guowei on 2018/7/16.
 */
public class Solution94 {
    public static void main(String[] args) {
        Solution94 solution94 = new Solution94();
        TreeNode node1 = solution94.new TreeNode(1);
        TreeNode node2 = solution94.new TreeNode(2);
        TreeNode node3 = solution94.new TreeNode(3);
        node1.right = node2;
        node2.left = node3;
        List<Integer> inorderList = solution94.inorderTraversal(node1);
        System.out.println();
    }

    /**
     * 中序遍历的非递归算法
     *
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        if (null == root)
            return new ArrayList<Integer>();
        List<Integer> resList = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = root;
        while (true) {
            while (null != node) {
                stack.add(node);
                node = node.left;
            }
            if (stack.empty())
                break;
            TreeNode curNode = stack.pop();
            resList.add(curNode.val);
            if (curNode == root || null != curNode.right) {
                node = curNode.right;
            }
            else {
                if (stack.empty())
                    break;
                TreeNode parentNode = stack.pop();
                resList.add(parentNode.val);
                node = parentNode.right;
            }
        }
        return resList;
    }

    /**
     * 中序遍历的递归算法
     *
     * @param root
     */
    private void inorder(TreeNode root) {
        if (null == root)
            return;
        System.out.println(root.val);
        inorder(root.left);
        inorder(root.right);
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int x) {
            this.val = x;
            this.left = null;
            this.right = null;
        }
    }
}
