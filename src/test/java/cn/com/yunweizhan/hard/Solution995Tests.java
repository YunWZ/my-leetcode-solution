package cn.com.yunweizhan.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Weizhan▪Yun
 * @date 2022/7/7 15:14
 */
class Solution995Tests {
	private static final Solution995 INSTANCE = new Solution995();

	@Test
	void minKBitFlips() {
		test(2, new int[] {0, 1, 0}, 1);
		test(-1, new int[] {1, 1, 0}, 2);
		test(3, new int[] {0, 0, 0, 1, 0, 1, 1, 0}, 3);
	}

	private void test(int expected, int[] nums, int k) {
		assertEquals(expected, INSTANCE.minKBitFlips(nums, k));
	}
}