package cn.com.yunweizhan.middle;

public class Solution55 {

    public boolean canJump(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (i > k) return false;
            k = Math.max(k, i + nums[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {0, 2, 3};
        Solution55 solution55 = new Solution55();
        System.out.println(solution55.canJump(nums));
    }
}
