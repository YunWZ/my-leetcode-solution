package cn.com.yunweizhan.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Weizhan▪Yun
 * @date 2022/6/8 21:56
 */
class Solution646Tests {
	private static final Solution646 INSTANCE = new Solution646();

	@Test
	void solution() {
		assertEquals(2, INSTANCE.findLongestChain(new int[][] {{1, 2}, {2, 3}, {3, 4}}));
		assertEquals(3, INSTANCE.findLongestChain(new int[][] {{1, 2}, {7, 8}, {4, 5}}));
	}
}