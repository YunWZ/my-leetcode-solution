package cn.com.yunweizhan.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Weizhan▪Yun
 * @date 2022/5/6 15:28
 */
class Solution1780Tests {
	public static final Solution1780 INSTANCE = new Solution1780();

	@Test
	void checkPowersOfThree() {
		test(12, true);
		test(91, true);
		test(21, false);
		test(11, false);
	}

	private void test(int n, boolean expected) {
		assert INSTANCE.checkPowersOfThree(n) == expected;
	}
}