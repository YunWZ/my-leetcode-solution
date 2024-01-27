package cn.com.yunweizhan.medium;

public class Solution650 {
	int INF = 0x3f3f3f3f;

	public int minSteps(int n) {
		int[][] steps = new int[n + 1][n + 1];
		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j < n + 1; j++) {
				steps[i][j] = INF;
			}
		}

		steps[1][0] = 0; steps[1][1] = 1;
		for (int i = 2; i < n + 1; i++) {
			int min = INF;
			for (int j = 0; j <= i / 2; j++) {
				steps[i][j] = steps[i - j][j] + 1;
				min = Math.min(min, steps[i][j]);
			}
			steps[i][i] = min + 1;
		}
		int ans = INF;
		for (int i = 0; i < n + 1; i++) {
			ans = Math.min(ans, steps[n][i]);
		}

		return ans;
	}
}
