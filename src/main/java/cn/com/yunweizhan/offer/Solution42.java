package cn.com.yunweizhan.offer;

public class Solution42 {
	public int maxSubArray(int[] nums) {
		if (nums.length == 1)
			return nums[0];
		int maxSum = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i - 1] <= 0) {
				maxSum = Math.max(maxSum, nums[i]);
			}
			else {
				nums[i] += nums[i - 1];
				maxSum = Math.max(maxSum, nums[i]);
			}
		}

		return maxSum;
	}

	public static void main(String[] args) {
		int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		Solution42 solution42 = new Solution42();
		System.out.println(solution42.maxSubArray(nums));
	}
}
