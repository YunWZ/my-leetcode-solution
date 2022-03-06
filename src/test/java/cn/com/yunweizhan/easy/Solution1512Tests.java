package cn.com.yunweizhan.easy;

import cn.com.yunweizhan.BaseTests;
import org.junit.jupiter.api.Test;

class Solution1512Tests extends BaseTests {
	private static final Solution1512 solution = new Solution1512();

	@Test
	public void test1() {
		int[] nums = {1, 2, 3, 1, 1, 3};
		run(nums);
	}

	@Test
	public void test2() {
		int[] nums = {1, 1, 1, 1};
		run(nums);
	}

	@Test
	public void test3() {
		int[] nums = {1, 2, 3};
		run(nums);
	}

	private void run(int[] nums) {
		print(solution.numIdenticalPairs(nums));
	}

}