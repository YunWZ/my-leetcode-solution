package cn.com.yunweizhan.medium;

import cn.com.yunweizhan.BaseTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution714Tests extends BaseTests {
	private Solution714 solution714 = new Solution714();

	@Test
	void maxProfit() {
		int[] prices = {1, 3, 2, 8, 4, 9};
		int fee = 2;
		System.out.println(solution714.maxProfit(prices, fee));
	}
}