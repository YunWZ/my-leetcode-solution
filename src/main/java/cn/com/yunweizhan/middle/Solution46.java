package cn.com.yunweizhan.middle;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution46 {
    boolean used[];

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        if (nums == null || nums.length == 0)
            return res;
        used = new boolean[nums.length];
        dfs(nums, nums.length, 0, res, new ArrayList<Integer>(nums.length));
        return res;
    }

    private void dfs(int[] nums, int length, int deepth, List<List<Integer>> res, List<Integer> path) {
        if (length == deepth) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < length; i++) {
            if (!used[i]) {
                used[i] = true;
                path.add(nums[i]);

                dfs(nums, length, deepth + 1, res, path);

                used[i] = false;
                path.remove(deepth);
            }
        }
    }

    public static void main(String[] args) {
        Solution46 solution46 = new Solution46();
        int[] nums = {1,2,3};
        System.out.println(solution46.permute(nums));
    }
}
