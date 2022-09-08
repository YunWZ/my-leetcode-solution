package cn.com.yunweizhan.easy;

/**
 * 283. 移动零
 * <p>
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * @author Weizhan▪Yun
 * @date 2022/9/8 15:18
 */
public class Solution283 {
	public void moveZeroes(int[] nums) {
		int left = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[left++] = nums[i];
			}

		}

		for (int i = left; i < nums.length; i++) {
			nums[i] = 0;
		}
	}
}
