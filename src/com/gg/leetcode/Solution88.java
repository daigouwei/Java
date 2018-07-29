package com.gg.leetcode;

/**
 * Created by guowei on 2018/7/29.
 */
public class Solution88 {
    public static void main(String[] args) {
        Solution88 s = new Solution88();
        s.merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (k >= 0) {
            if (0 > i)
                nums1[k--] = nums2[j--];
            else if (0 > j) {
                nums1[k--] = nums1[i--];
            }
            else
                nums1[k--] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
        }
    }
}
