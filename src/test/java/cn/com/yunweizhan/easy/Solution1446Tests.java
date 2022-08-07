package cn.com.yunweizhan.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Weizhan▪Yun
 * @date 2022/8/7 11:49
 */
class Solution1446Tests {
	private static final Solution1446 INSTANCE = new Solution1446();

	@Test
	void maxPower() {
		test("leetcode", 2);
		test("abbcccddddeeeeedcba", 5);
		test("hooraaaaaaaaaaay",11);
	}

	private void test(String s, int expected) {
		assertEquals(expected, INSTANCE.maxPower(s));
	}
}