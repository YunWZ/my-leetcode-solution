package com.github.ywz.low;

public class Solution724 {
    public int pivotIndex(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int sum = 0;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            sum += nums[i];
        }

        int leftSum = 0;
        for (int i = 0; i < length; i++) {
            if (2 * leftSum == (sum - nums[i])) {
                return i ;
            } else {
                leftSum += nums[i];
            }
        }
        return -1;
    }
}
