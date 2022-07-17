package cn.com.yunweizhan.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Weizhan▪Yun
 * @date 2022/7/12 18:00
 */
class Solution2171Tests {
	private static final Solution2171 INSTANCE = new Solution2171();

	@Test
	void minimumRemoval() {
		test(new int[] {4, 1, 6, 5}, 4);
		test(new int[] {2, 10, 3, 2}, 7);
	}

	private void test(int[] beans, int expected) {
		assertEquals(expected, INSTANCE.minimumRemoval(beans));
	}
}