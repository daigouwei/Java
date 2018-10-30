package com.gg.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by guowei on 2018/10/29.
 */
public class Solution54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (0 == matrix.length) {
            return Collections.EMPTY_LIST;
        }
        int linemin = 1, linemax = matrix.length, colmin = 0, colmax = matrix[0].length;
        List<Integer> res = new ArrayList<>(linemax * colmax);
        for (int i = 0; i < linemax; i++) {
            for (int j = colmin; j < colmax; j++) {
                res.add(matrix[i][j]);
                if (j == colmax - 1) {
                    colmax--;
                    for (int m = linemin; m < linemax; m++) {
                        res.add(matrix[m][j]);
                        if (m == linemax - 1) {
                            linemax--;
                            for (int n = colmax - 1; n >= colmin; n--) {
                                res.add(matrix[m][n]);
                                if (n == colmin) {
                                    colmin++;
                                    for (int p = linemax - 1; p >= linemin; p--) {
                                        res.add(matrix[p][n]);
                                        if (p == linemin) {
                                            linemin++;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return res;
    }
}
