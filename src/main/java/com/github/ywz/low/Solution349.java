package com.github.ywz.low;

import java.util.HashSet;
import java.util.Set;

public class Solution349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) {
            return new int[]{};
        }

        Set<Integer> nums1Set = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        for (int i : nums1) {
            nums1Set.add(i);
        }

        for (int i : nums2) {
            if (nums1Set.contains(i)) {
                res.add(i);
            }
        }
        int[] result = new int[res.size()];
        int j = 0;
        for (Integer re : res) {
            result[j++] = re;
        }
        return result;
    }
}
