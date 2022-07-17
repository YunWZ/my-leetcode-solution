package cn.com.yunweizhan.hard;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 跳跃游戏 V
 * 给你一个整数数组 arr 和一个整数 d 。每一步你可以从下标 i 跳到：
 * <p>
 * i + x ，其中 i + x < arr.length 且 0 < x <= d 。
 * i - x ，其中 i - x >= 0 且 0 < x <= d 。
 * 除此以外，你从下标 i 跳到下标 j 需要满足：arr[i] > arr[j] 且 arr[i] > arr[k] ，其中下标 k 是所有 i 到 j 之间的数字（更正式的，min(i, j) < k < max(i, j)）。
 * <p>
 * 你可以选择数组的任意下标开始跳跃。请你返回你 最多 可以访问多少个下标。
 * <p>
 * 请注意，任何时刻你都不能跳到数组的外面。
 *
 * @author Weizhan▪Yun
 * @date 2022/7/17 12:01
 */
public class Solution1340 {
	public int maxJumps(int[] arr, int d) {
		int length = arr.length;
		Integer[] sortedIndex = new Integer[length];
		int[] dp = new int[length];
		for (int i = 0; i < length; i++) {
			dp[i] = 1;
			sortedIndex[i] = i;
		}

		Arrays.sort(sortedIndex, Comparator.comparingInt(i -> arr[i]));
		int ans = 0;
		for (int i = 0; i < length; i++) {
			var index = sortedIndex[i];
			var leftIndex = Math.max(index - d, 0);
			var rightIndex = Math.min(length - 1, index + d);

			int leftMax = 0, rightMax = 0;
			for (int j = index - 1; j >= leftIndex; j--) {
				if (arr[j] >= arr[index]) {
					break;
				}
//				dp[index] = Math.max(dp[index], dp[j] + 1);
				leftMax = Math.max(leftMax, dp[j]);
			}

			for (int j = index + 1; j <= rightIndex; j++) {
				if (arr[j] >= arr[index]) {
					break;
				}
//				dp[index] = Math.max(dp[index], dp[j] + 1);
				rightMax = Math.max(rightMax, dp[j]);
			}
			dp[index] = Math.max(leftMax, rightMax) + 1;

			ans = Math.max(ans, dp[index]);
		}

		return ans;
	}
}
