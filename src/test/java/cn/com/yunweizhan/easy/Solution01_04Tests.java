package cn.com.yunweizhan.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution01_04Tests {

	private final Solution01_04 solution01_04 = new Solution01_04();

	@Test
	public void test1() {
		String s = "tactcoa";
		assertTrue(solution01_04.canPermutePalindrome(s));
	}

}