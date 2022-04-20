package cn.com.yunweizhan.medium;

/**
 * 最佳观光组合
 *
 * 给你一个正整数数组 values，其中 values[i] 表示第 i 个观光景点的评分，并且两个景点 i 和 j 之间的 距离 为 j - i。
 *
 * 一对景点（i < j）组成的观光组合的得分为 values[i] + values[j] + i - j ，也就是景点的评分之和 减去 它们两者之间的距离。
 *
 * 返回一对观光景点能取得的最高分
 *
 * @author Weizhan▪Yun
 * @date 2022/4/20 10:20
 */
public class Solutio1014 {
	public int maxScoreSightseeingPair(int[] values) {
		int ans = 0, preMax = values[0];
		for (int i = 1; i < values.length; i++) {
			ans = Math.max(ans, values[i] - i + preMax);
			preMax = Math.max(preMax, values[i] + i);
		}

		return ans;
	}
}
