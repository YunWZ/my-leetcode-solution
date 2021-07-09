package cn.com.yunweizhan.high;

public class Solution327 {
    private int lower, upper;
    private int[] nums;

    public int countRangeSum(int[] nums, int lower, int upper) {
        this.nums = nums;
        this.lower = lower;
        this.upper = upper;
        return countRangeSum(0, nums.length - 1);

    }

    private int countRangeSum(int lo, int hi) {
        int ans = 0;
        int temp = 0;
        for (int j = lo; j <= hi; j++) {
            temp += nums[j];
            if (isAvailable(temp))
                ans++;
        }
        return ans;
    }

    private boolean isAvailable(int temp) {
        if (temp >= lower || temp <= upper)
            return true;
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 5, -1};
        int lower = -2, upper = 2;
        Solution327 solution327 = new Solution327();
        System.out.println(solution327.countRangeSum(nums, 0, 0));
    }

}
