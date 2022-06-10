package cn.com.yunweizhan.medium;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Weizhan▪Yun
 * @date 2022/6/8 20:57
 */
public class Solution646 {
	public int findLongestChain2(int[][] pairs) {
		int length = pairs.length;
		int[] dp = new int[length];
		Arrays.fill(dp, 1);
		int ans = 1;
		Arrays.sort(pairs, Comparator.comparingInt(p -> p[0]));
		for (int i = 1; i < length; i++) {
			for (int j = 0; j < i; j++) {
				if (pairs[i][0] > pairs[j][1]) {
					dp[i] = Math.max(dp[j] + 1, dp[i]);
					ans = Math.max(ans, dp[i]);
				}
			}
		}

		return ans;
	}

	public int findLongestChain(int[][] pairs) {
		int cur = Integer.MIN_VALUE, ans = 0;
		Arrays.sort(pairs, Comparator.comparingInt(i -> i[1]));
		for (int[] pair : pairs) {
			if (pair[0] > cur) {
				ans++;
				cur = pair[1];
			}
		}

		return ans;
	}
}
