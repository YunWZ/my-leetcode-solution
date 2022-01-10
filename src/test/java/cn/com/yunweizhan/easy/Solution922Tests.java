package cn.com.yunweizhan.easy;

import cn.com.yunweizhan.BaseTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution922Tests extends BaseTests {
	private static final Solution922 solution = new Solution922();

	@Test
	void test1() {
		int[] nums = {4, 2, 5, 7};
		run(nums);
	}

	void run(int[] nums) {
		printArray(solution.sortArrayByParityII(nums));
	}

	@Test
	void test2() {
		int[] nums = {2, 3};
		run(nums);
	}
}