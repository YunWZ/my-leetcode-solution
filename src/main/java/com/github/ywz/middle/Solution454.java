package com.github.ywz.middle;

import java.util.HashMap;
import java.util.Map;

public class Solution454 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int length = A.length;
        Map<Integer, Integer> map = new HashMap<>(length ^ 2);
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                int sum = A[i] + B[j];
                int count = map.getOrDefault(sum, 0);
                map.put(sum, ++count);
            }
        }
        int res = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                res += map.getOrDefault(-(C[i] + D[j]), 0);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] A = {1, 2};
        int[] B = {-2, -1};
        int[] C = {-1, 2};
        int[] D = {0, 2};

        Solution454 solution454 = new Solution454();
        System.out.println(solution454.fourSumCount(A, B, C, D));
    }
}
