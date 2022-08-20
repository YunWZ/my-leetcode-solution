package cn.com.yunweizhan.medium;

/**
 * 528. 按权重随机选择
 *
 * @author Weizhan▪Yun
 * @date 2022/8/20 16:01
 */
public class Solution528 {
	int[] sum;

	public Solution528(int[] w) {
		int n = w.length;
		sum = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			sum[i] = sum[i - 1] + w[i - 1];
		}
	}

	public int pickIndex() {
		int n = sum.length;
		int t = (int) (Math.random() * sum[n - 1]) + 1;
		int l = 1, r = n - 1;
		while (l < r) {
			int mid = l + r >> 1;
			if (t <= sum[mid]) {
				r = mid;
			}
			else {
				l = mid + 1;
			}
		}

		return r - 1;
	}

}
