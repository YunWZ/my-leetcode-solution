package com.github.ywz.middle;

import java.util.HashSet;
import java.util.Set;

public class Solution1072 {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        int maxRowNum = 0;
        int length = matrix.length;
        Set<Integer>[] solution0 = new HashSet[length];
        Set<Integer>[] solution1 = new HashSet[length];
        for (int i = 0; i < length; i++) {
            int[] row = matrix[i];
            for (int j = 0; j < row.length; j++) {
                if (row[j] == 0) {
                    solution1[i].add(j);
                } else {
                    solution0[i].add(j);
                }
            }
        }

        for (int i = 0; i < length; i++) {
            int num1 = 0;
            int num = 0;
            for (int j = i + 1; j < solution0.length; j++) {
                if (solution0[i].equals(solution0[j])) {
                    num++;
                } else if (solution1[i].equals(solution1[j
                        ])) {
                    num1++;
                }
            }

            maxRowNum = Math.max(Math.max(maxRowNum, num), num1);
        }

        return maxRowNum;
    }


}