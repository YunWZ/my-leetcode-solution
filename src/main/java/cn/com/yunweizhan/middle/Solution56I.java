package cn.com.yunweizhan.middle;

public class Solution56I {
    public int[] singleNumbers(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res ^= nums[i];
        }
        res = res & -res;
        int result1 = 0;
        int result2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((res & nums[i]) != 0) {
                result1 ^= nums[i];
            } else
                result2 ^= nums[i];
        }

        return new int[]{result1, result2};
    }

    public static void main(String[] args) {
        Solution56I solution56I = new Solution56I();
        int[] nums = {1,2,5,2};
        int[] x = solution56I.singleNumbers(nums);
        System.out.printf("result: [%d, %d]", x[0], x[1]);
    }
}
