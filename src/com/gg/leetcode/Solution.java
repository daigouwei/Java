package com.gg.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author guowei
 * @date 2019/3/13
 */
public class Solution {
    class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public int getTreeDeepLen(TreeNode treeNode) {
        if (null == treeNode) {
            return 0;
        }
        int leftLen = getTreeDeepLen(treeNode.left);
        int rightLen = getTreeDeepLen(treeNode.right);
        return leftLen > rightLen ? leftLen + 1 : rightLen + 1;
    }

    //107
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        return null;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length);
    }

    private TreeNode sortedArrayToBST(int[] nums, int left, int right) {
        if (right < left) {
            return null;
        }
        if (right == left) {
            return new TreeNode(nums[left]);
        }
        int mid = (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, left, mid);
        root.right = sortedArrayToBST(nums, mid + 1, right);
        return root;
    }

    public boolean isBalanced(TreeNode root) {
        if (null == root) {
            return true;
        }
        if (Math.abs(getTreeDeep(root.left) - getTreeDeep(root.right)) <= 1) {
            return isBalanced(root.left) && isBalanced(root.right);
        }
        else {
            return false;
        }
    }

    private int getTreeDeep(TreeNode root) {
        if (null == root) {
            return 0;
        }
        int leftLen = getTreeDeepLen(root.left);
        int rightLen = getTreeDeepLen(root.right);
        return leftLen > rightLen ? leftLen + 1 : rightLen + 1;
    }

    public int minDepth(TreeNode root) {
        if (null == root) {
            return 0;
        }
        int leftLen = minDepth(root.left);
        int rightLen = minDepth(root.right);
        if (0 == leftLen) {
            return rightLen + 1;
        }
        if (0 == rightLen) {
            return leftLen + 1;
        }
        return leftLen < rightLen ? leftLen + 1 : rightLen + 1;
    }

    public boolean hasPathSum(TreeNode root, int sum) {
        if (null == root) {
            return false;
        }
        if (null == root.left && null == root.right) {
            return root.val == sum;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> lists = new ArrayList<>();
        pathSum(root, sum, new ArrayList<>(), lists);
        return lists;
    }

    private void pathSum(TreeNode root, int sum, List<Integer> list, List<List<Integer>> lists) {
        if (null == root) {
            return;
        }
        list.add(root.val);
        if (null == root.left && null == root.right) {
            if (sum == root.val) {
                lists.add(new ArrayList<>(list));
            }
            return;
        }
        pathSum(root.left, sum - root.val, new ArrayList<>(list), lists);
        pathSum(root.right, sum - root.val, new ArrayList<>(list), lists);
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> resList = new ArrayList<>();
        if (root == null) {
            return resList;
        }
        binaryTreePaths(root, "", resList);
        return resList;
    }

    private void binaryTreePaths(TreeNode root, String str, List<String> resList) {
        if (root.left == null && root.right == null) {
            resList.add(str + root.val);
            return;
        }
        if (root.left != null) {
            binaryTreePaths(root.left, str + root.val + "->", resList);
        }
        if (root.right != null) {
            binaryTreePaths(root.right, str + root.val + "->", resList);
        }
    }

    public void preOrder(TreeNode root) {
        if (null == root) {
            return;
        }
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    //剪绳子——给你一根长度为n的绳子，请把绳子剪成m段（m、n都是整数，n>1并且m>1），每段绳子的长度记为k[0],k[1],...,k[m]。请问k[0]*k[1]*...*k[m]可能的最大乘积是多少？
    //例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
    public int cutRope(int n) {
        if (2 == n) {
            return 1;
        }
        //        if (3 == n) {
        //            return 2;
        //        }
        int max = 0;
        for (int i = 2; i <= n / 2; i++) {
            int val = Math.max(cutRope(i), i) * Math.max(cutRope(n - i), n - i);
            if (val > max) {
                max = val;
            }
        }
        return max;
    }

    public int lis(int[] nums, int index) {
        if (0 == index) {
            return 1;
        }
        int max = 0;
        for (int i = index; i > 0; i--) {
            for (int j = index - 1; j >= 0; j--) {
                if (nums[j] < nums[i]) {
                    int val = lis(nums, j) + 1;
                    if (val > max) {
                        max = val;
                    }
                }
            }
        }
        return max;
    }

    //输入一个整数数组，实现一个函数来调整该整数数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
    public void adjust(int[] nums) {
        int pre = 0;
        int post = nums.length - 1;
        while (pre <= post) {
            if (isEven(nums[pre]) && isOdd(nums[post])) {
                int tmp = nums[pre];
                nums[pre] = nums[post];
                nums[post] = tmp;
                pre++;
                post--;
                continue;
            }
            if (isOdd(nums[pre])) {
                pre++;
            }
            if (isEven(nums[post])) {
                post--;
            }
        }
    }

    private boolean isOdd(int num) {
        return num % 2 == 1;
    }

    private boolean isEven(int num) {
        return !isOdd(num);
    }

    public void getMirrorTree(TreeNode treeNode) {
        if (null == treeNode) {
            return;
        }
        if (null == treeNode.left && null == treeNode.right) {
            return;
        }
        TreeNode tmp = treeNode.left;
        treeNode.left = treeNode.right;
        treeNode.right = tmp;
        getMirrorTree(treeNode.right);
        getMirrorTree(treeNode.left);
    }

    public boolean isMirrorTree(TreeNode treeNode) {
        if (null == treeNode) {
            return true;
        }
        return isMirror(treeNode.left, treeNode.right);
    }

    private boolean isMirror(TreeNode treeNode1, TreeNode treeNode2) {
        if (null == treeNode1 && null == treeNode2) {
            return true;
        }
        if (null == treeNode1 || null == treeNode2) {
            return false;
        }
        if (treeNode1.val != treeNode2.val) {
            return false;
        }
        return isMirror(treeNode1.left, treeNode2.right) && isMirror(treeNode1.right, treeNode2.left);
    }

    public boolean isContain(TreeNode treeNode1, TreeNode treeNode2) {
        if (treeNode1 == null || treeNode2 == null) {
            return false;
        }
        boolean isCon = false;
        if (treeNode1.val == treeNode2.val) {
            isCon = isSame(treeNode1, treeNode2);
        }
        if (!isCon) {
            isCon = isContain(treeNode1.left, treeNode2);
        }
        if (!isCon) {
            isCon = isContain(treeNode1.right, treeNode2);
        }
        return isCon;
    }

    private boolean isSame(TreeNode treeNode1, TreeNode treeNode2) {
        if (treeNode2 == null) {
            return true;
        }
        if (treeNode1 == null) {
            return false;
        }
        boolean result = false;
        if (treeNode1.val == treeNode2.val) {
            result = isSame(treeNode1.left, treeNode2.left);
            if (!result) {
                return false;
            }
            return isSame(treeNode1.right, treeNode2.right);
        }
        return false;
    }

    public static int[] quickSort(int[] nums, int left, int right) {
        if (left >= right) {
            return nums;
        }
        int pivot = nums[left];
        int index = left + 1;
        for (int i = left + 1; i < right + 1; i++) {
            if (nums[i] < pivot) {
                swap(nums, i, index);
                index++;
            }
        }
        swap(nums, left, index - 1);
        quickSort(nums, left, index - 2);
        quickSort(nums, index, nums.length - 1);
        return nums;
    }

    public static int[] mergeSort(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }
        int mid = nums.length / 2;
        int[] sortedLeftNums = mergeSort(Arrays.stream(nums).limit(mid).toArray());
        int[] sortedRightNums = mergeSort(Arrays.stream(nums).skip(mid).toArray());
        int[] sortedNums = new int[nums.length];
        int index = 0;
        int sortedLeftIndex = 0;
        int sortedRightIndex = 0;
        while (sortedLeftIndex < sortedLeftNums.length && sortedRightIndex < sortedRightNums.length) {
            if (sortedLeftNums[sortedLeftIndex] < sortedRightNums[sortedRightIndex]) {
                sortedNums[index++] = sortedLeftNums[sortedLeftIndex++];
            }
            else {
                sortedNums[index++] = sortedRightNums[sortedRightIndex++];
            }
        }
        while (sortedLeftIndex < sortedLeftNums.length) {
            sortedNums[index++] = sortedLeftNums[sortedLeftIndex++];
        }
        while (sortedRightIndex < sortedRightNums.length) {
            sortedNums[index++] = sortedRightNums[sortedRightIndex++];
        }
        return sortedNums;
    }

    public static int[] shellSort(int[] nums) {
        for (int gap = nums.length / 2; gap >= 1; gap /= 2) {
            for (int i = gap; i < nums.length; i++) {
                int j = i;
                while (j - gap >= 0 && nums[j] < nums[j - gap]) {
                    swap(nums, j, j - gap);
                    j -= gap;
                }
            }
        }
        return nums;
    }

    private static void swap(int[] nums, int i, int j) {
        if (i == j) {
            return;
        }
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
