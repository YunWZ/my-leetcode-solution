package cn.com.yunweizhan.medium;

/**
 * @author Weizhan▪Yun
 * @date 2022/9/20 21:29
 */
public class Solution309 {
	public int maxProfit(int[] prices) {
		var profits = new int[] {0, 0, -prices[0]};

		for (int i = 1; i < prices.length; i++) {
			int a = profits[0], b = profits[1], c = profits[2];
			profits[0] = Math.max(a, b);
			profits[1] = c + prices[i];
			profits[2] = Math.max(a - prices[i], c);
		}

		return Math.max(profits[0], profits[1]);
	}
}
