package com.gg.leetcode2019;

//编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target。该矩阵具有以下特性：
//        每行的元素从左到右升序排列。
//        每列的元素从上到下升序排列。

public class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || (matrix.length == 1 && matrix[0].length == 0)) {
            return false;
        }
        int row = matrix.length - 1;
        int colomn = 0;
        while (true) {
            if (row < 0 || colomn > matrix[0].length - 1) {
                return false;
            }
            if (target == matrix[row][colomn]) {
                return true;
            }
            else if (target > matrix[row][colomn]) {
                colomn++;
            }
            else if (target < matrix[row][colomn]) {
                row--;
            }

        }
    }
}

//找出左下角元素，判断target和该值大小，如果大就向右找该值，吐过小就向上找该值
