package cn.com.yunweizhan.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Weizhan▪Yun
 * @date 2022/4/30 16:06
 */
class Solution42Tests {
	public static final Solution42 INSTANCE = new Solution42();

	@Test
	void trap() {
		test(new int[] {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}, 6);
	}

	@Test
	void trap2() {
		test(new int[] {4, 2, 0, 3, 2, 5}, 9);
	}

	private void test(int[] heights, int expect) {
		assertEquals(expect, INSTANCE.trap(heights));
	}
}