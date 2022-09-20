package cn.com.yunweizhan.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Weizhan▪Yun
 * @date 2022/9/20 22:06
 */
class Solution309Tests {
	private static final Solution309 Instance = new Solution309();

	@Test
	public void maxProfit() {
		test(new int[] {1, 2, 3, 0, 2});
	}

	public void test(int[] prices) {
		assertEquals(3, Instance.maxProfit(prices));
	}
}