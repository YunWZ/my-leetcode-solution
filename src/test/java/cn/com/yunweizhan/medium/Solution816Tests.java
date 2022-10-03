package cn.com.yunweizhan.medium;

import org.junit.jupiter.api.Test;

/**
 * @author Weizhan▪Yun
 * @date 2022/10/3 11:02
 */
class Solution816Tests {
	private static final Solution816 INSTANCE = new Solution816();

	@Test
	void ambiguousCoordinates() {
		test("(123)");
		test("(00011)");
		test("(0123)");
		test("(100)");
	}

	private void test(String s) {
		System.out.println(INSTANCE.ambiguousCoordinates(s));
	}
}