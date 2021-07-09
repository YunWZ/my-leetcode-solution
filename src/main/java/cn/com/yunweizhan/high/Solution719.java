package cn.com.yunweizhan.high;

import java.util.ArrayList;
import java.util.List;

public class Solution719 {
    public int smallestDistancePair(int[] nums, int k) {
        int length = nums.length;
        List<Integer> dis = new ArrayList<>(k);
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                int abs = Math.abs(nums[j] - nums[i]);
                if (dis.size() < k) {
                    dis.add(abs);
                } else if (dis.get(k - 1) > abs) {
                    dis.set(k - 1, abs);
                }
                dis.sort(Integer::compareTo);
            }
        }


        return dis.get(k - 1);
    }

    public static void main(String[] args) {
        int[] nums = {9,10,7,10,6,1,5,4,9,8};
        Solution719 solution719 = new Solution719();
        System.out.println(solution719.smallestDistancePair(nums, 18));
    }
}
