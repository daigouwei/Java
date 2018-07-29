package com.gg.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guowei on 2018/7/29.
 */
public class Solution95 {
    public static void main(String[] args) {
        Solution95 s = new Solution95();
        List<TreeNode> resList = s.generateTrees(3);
        System.out.println();
    }

    public List<TreeNode> generateTrees(int n) {
        List<TreeNode> treeNodes = new ArrayList<TreeNode>();
        List<Integer> nList = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            nList.add(i);
        }
        for (int i = 1; i <= n; i++) {
            treeNodes.addAll(recursionBST(i, nList.subList(0, i - 1), nList.subList(i, n)));
        }
        return treeNodes;
    }

    private List<TreeNode> recursionBST(int n, List<Integer> leftList, List<Integer> rightList) {
        if (leftList.isEmpty() && rightList.isEmpty())
            return new ArrayList<TreeNode>() {
                {
                    add(new TreeNode(n));
                }
            };
        List<TreeNode> resLeftList = new ArrayList<TreeNode>();
        List<TreeNode> resRightList = new ArrayList<TreeNode>();
        if (!leftList.isEmpty()) {
            for (int i = 0; i < leftList.size(); i++) {
                int nTmp = leftList.get(i);
                List<Integer> leftListTmp = leftList.subList(0, i);
                List<Integer> rightListTmp = leftList.subList(i + 1, leftList.size());
                List<TreeNode> childTreeList = recursionBST(nTmp, leftListTmp, rightListTmp);
                for (TreeNode childTree : childTreeList) {
                    resLeftList.add(childTree);
                }
            }
        }
        if (!rightList.isEmpty()) {
            for (int i = 0; i < rightList.size(); i++) {
                int nTmp = rightList.get(i);
                List<Integer> leftListTmp = rightList.subList(0, i);
                List<Integer> rightListTmp = rightList.subList(i + 1, rightList.size());
                List<TreeNode> childTreeList = recursionBST(nTmp, leftListTmp, rightListTmp);
                for (TreeNode childTree : childTreeList) {
                    resRightList.add(childTree);
                }
            }
        }
        List<TreeNode> resList = new ArrayList<TreeNode>();
        for (TreeNode resLeft : resLeftList) {
            for (TreeNode resRight : resRightList) {
                TreeNode root = new TreeNode(n);
                root.left = resLeft;
                root.right = resRight;
                resList.add(root);
            }
        }
        if (resLeftList.isEmpty()) {
            for (TreeNode resRight : resRightList) {
                TreeNode root = new TreeNode(n);
                root.right = resRight;
                resList.add(root);
            }
        }
        if (resRightList.isEmpty()) {
            for (TreeNode resLeft : resLeftList) {
                TreeNode root = new TreeNode(n);
                root.left = resLeft;
                resList.add(root);
            }
        }
        return resList;
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
