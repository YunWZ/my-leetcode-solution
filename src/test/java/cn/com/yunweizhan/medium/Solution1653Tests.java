package cn.com.yunweizhan.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Weizhan▪Yun
 * @date 2022/4/28 22:32
 */
class Solution1653Tests {
	public static final Solution1653 instance = new Solution1653();

	@Test
	void minimumDeletions() {
		test("aababbab");
	}

	private void test(String str) {
		System.out.println(instance.minimumDeletions(str));
	}
}