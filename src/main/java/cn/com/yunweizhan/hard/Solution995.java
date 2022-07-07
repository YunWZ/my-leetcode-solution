package cn.com.yunweizhan.hard;

import java.util.LinkedList;
import java.util.Queue;

/**
 * K 连续位的最小翻转次数
 * <p>
 * 给定一个二进制数组 nums 和一个整数 k 。
 * <p>
 * k位翻转 就是从 nums 中选择一个长度为 k 的 子数组 ，同时把子数组中的每一个 0 都改成 1 ，把子数组中的每一个 1 都改成 0 。
 * <p>
 * 返回数组中不存在 0 所需的最小 k位翻转 次数。如果不可能，则返回-1。
 * <p>
 * 子数组 是数组的 连续 部分
 *
 * @author Weizhan▪Yun
 * @date 2022/7/7 14:08
 */
public class Solution995 {
	public int minKBitFlips(int[] nums, int k) {
		int ans = 0;
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 0; i < nums.length; i++) {
			if (!queue.isEmpty() && queue.peek() + k == i) {
				queue.poll();
			}

			if (queue.size() % 2 == nums[i]) {
				if (i+k> nums.length){
					return -1;
				}

				queue.add(i);
				ans++;
			}
		}

		return ans;
	}
}
