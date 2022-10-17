package cn.com.yunweizhan.easy;

/**
 * @author Weizhan▪Yun
 * @date 2022/10/17 15:32
 */
public class Solution2293 {
	public int minMaxGame(int[] nums) {
		while (nums.length > 1) {
			int[] newNums = new int[nums.length / 2];
			for (int i = 0; i < newNums.length; i++) {
				if ((i & 1) == 0) {
					newNums[i] = Math.min(nums[i * 2], nums[i * 2 + 1]);
				}
				else {
					newNums[i] = Math.max(nums[i * 2], nums[i * 2 + 1]);
				}
			}

			nums = newNums;
		}

		return nums[0];
	}
}
