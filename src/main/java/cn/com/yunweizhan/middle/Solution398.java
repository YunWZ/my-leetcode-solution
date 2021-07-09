package cn.com.yunweizhan.middle;

import java.util.*;

public class Solution398 {
    Map<Integer, List<Integer>> map = new HashMap<>();
    Random random = new Random();

    public void Solution(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            List<Integer> indexes = map.getOrDefault(nums[i], new LinkedList<>());
            indexes.add(i);
            map.put(nums[i], indexes);
        }

    }

    public int pick(int target) {
        List<Integer> indexes = map.get(target);
        int size = indexes.size();

        int i = random.nextInt(size);
        return indexes.get(i);
    }

    public static void main(String[] args) {
        Solution398 solution398 = new Solution398();
        int[] nums = new int[]{1, 2, 3, 3, 3};
        solution398.Solution(nums);
        System.out.println(solution398.pick(3));
        System.out.println(solution398.pick(1));

    }
}
