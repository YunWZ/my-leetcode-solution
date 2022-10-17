package cn.com.yunweizhan.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Weizhan▪Yun
 * @date 2022/10/17 15:42
 */
class Solution2293Tests {
	private static final Solution2293 INSTANCE = new Solution2293();

	@Test
	void minMaxGame() {
		test(new int[] {1, 3, 5, 2, 4, 8, 2, 2}, 1);
	}

	private void test(int[] nums, int expected) {
		assertEquals(expected, INSTANCE.minMaxGame(nums));
	}
}