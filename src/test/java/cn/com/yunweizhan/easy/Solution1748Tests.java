package cn.com.yunweizhan.easy;

import org.junit.jupiter.api.Test;

class Solution1748Tests {
	private final Solution1748 solution1748;

	Solution1748Tests() {
		this.solution1748 = new Solution1748();
	}

	@Test
	public void test1() {
		int[] nums = {1, 2, 3, 2};
		System.out.println(solution1748.sumOfUnique(nums));
	}

	@Test
	public void test2() {
		int[] nums = {10};
		System.out.println(solution1748.sumOfUnique(nums));
	}
}