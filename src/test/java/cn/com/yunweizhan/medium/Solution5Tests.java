package cn.com.yunweizhan.medium;

import cn.com.yunweizhan.BaseTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Weizhan▪Yun
 * @date 2022/4/2 17:04
 */
class Solution5Tests extends BaseTests {
	private Solution5 instance = new Solution5();

	private void test(String str, String experted) {
		String x = instance.longestPalindrome(str);
		assert experted.equals(x);
	}

	@Test
	void longestPalindrome1() {
		test("babad", "bab");
	}

	@Test
	void longestPalindrome2() {
		test("cbbd", "bb");
	}
}