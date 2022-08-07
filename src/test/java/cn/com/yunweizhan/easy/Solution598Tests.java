package cn.com.yunweizhan.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Weizhan▪Yun
 * @date 2022/8/7 11:32
 */
class Solution598Tests {
	private static final Solution598 INSTANCE = new Solution598();

	@Test
	void maxCount() {
		test(3, 3, new int[][] {{2, 2}, {3, 3}, {3, 3}, {3, 3}, {2, 2}, {3, 3}, {3, 3}, {3, 3}, {2, 2}, {3, 3}, {3, 3}, {3, 3}}, 4);
		test(3, 3, new int[][] {{}}, 9);
	}

	private void test(int m, int n, int[][] ops, int expected) {
		assertEquals(expected, INSTANCE.maxCount(m, n, ops));
	}
}