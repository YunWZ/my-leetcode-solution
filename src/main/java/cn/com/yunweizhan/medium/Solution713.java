package cn.com.yunweizhan.medium;

/**
 * 乘积小于K的子数组
 *
 * 给定一个正整数数组 nums和整数 k 。
 *
 * 请找出该数组内乘积小于 k 的连续的子数组的个数。
 */
public class Solution713 {
	public int numSubarrayProductLessThanK(int[] nums, int k) {
		if (k <= 1) {
			return 0;
		}

		int ans = 0, cal = 1, left = 0;

		for (int i = 0; i < nums.length; i++) {
			cal *= nums[i];
			while (cal >= k) {
				cal /= nums[left++];
			}
			ans += i - left + 1;
		}
		return ans;
	}
}
