package com.gg.leetcode2019;

//给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
//说明:
//初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
//你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。

public class Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (k >= 0) {
            if (0 > i)
                nums1[k--] = nums2[j--];
            else if (0 > j) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
            }
        }
    }

    public static void main(String[] args) {
        Merge merge = new Merge();
        int[] nums1 = {1, 3, 5, 7};
        int[] nums2 = {2, 3, 4, 6, 8, 10};
        merge.merge(nums1, 4, nums2, 6);
    }
}

//主要思路就是从最大的数开始考虑，然后先塞在最后面
