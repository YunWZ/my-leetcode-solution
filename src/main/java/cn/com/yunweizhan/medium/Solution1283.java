package cn.com.yunweizhan.medium;

/**
 * @author Weizhan▪Yun
 * @date 2022/4/26 21:01
 */
public class Solution1283 {
	public int smallestDivisor(int[] nums, int threshold) {
		int maxValue = Integer.MIN_VALUE;
		for (int num : nums) {
			if (num > maxValue) {
				maxValue = num;
			}
		}

		int left = 1, right = maxValue;

		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (sum(nums, mid) > threshold) {
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
		}

		return left ;
	}

	private int sum(int[] nums, int mid) {
		int add = mid - 1;
		int sum = 0;
		for (int num : nums) {
			sum += (num + add) / mid;
		}

		return sum;
	}
}
