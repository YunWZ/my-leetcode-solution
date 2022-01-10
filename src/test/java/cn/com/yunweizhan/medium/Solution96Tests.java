package cn.com.yunweizhan.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution96Tests {
	private final Solution96 ins = new Solution96();

	@Test
	public void test1() {
		int n = 3;
		assertEquals(5, ins.numTrees(3));
	}
}