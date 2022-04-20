package cn.com.yunweizhan.medium;

/**
 * 最大宽度坡
 *
 * 给定一个整数数组A，坡是元组(i, j)，其中i < j且A[i] <= A[j]。这样的坡的宽度为j - i。
 *
 * 找出A中的坡的最大宽度，如果不存在，返回 0 。
 *
 * @author Weizhan▪Yun
 * @date 2022/4/16 16:40
 */
public class Solution962 {

	public int maxWidthRamp(int[] nums) {

		int maxLength = 0;
		int length = 0;
		int left = 0, i = 1;
		for (; i < nums.length; i++) {
			if (nums[left] > nums[i]) {
				maxLength = Math.max(maxLength, i - left);
				left = i;
			}
		}
		maxLength = Math.max(maxLength, i - left-1);

		return maxLength;
	}
}
