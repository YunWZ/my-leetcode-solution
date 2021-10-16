package cn.com.yunweizhan.offer;

public class Solution63 {
	public int maxProfit(int[] prices) {
		int minPrice = Integer.MAX_VALUE, profit = 0;

		for (int i = 0; i < prices.length; i++) {
			minPrice = Math.min(prices[i], minPrice);
			profit = Math.max(profit, prices[i] - minPrice);
		}
		return profit;
	}

	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}

	private static void test1() {
		Solution63 solution63 = new Solution63();
		int[] prices = {7, 1, 5, 3, 6, 4};
		System.out.println(solution63.maxProfit(prices));
	}

	private static void test2() {
		Solution63 solution63 = new Solution63();
		int[] prices = {7, 6, 4, 3, 1};
		System.out.println(solution63.maxProfit(prices));
	}

	private static void test3() {
		Solution63 solution63 = new Solution63();
		int[] prices = {1, 2};
		System.out.println(solution63.maxProfit(prices));
	}
}
