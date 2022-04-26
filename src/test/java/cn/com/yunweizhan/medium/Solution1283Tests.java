package cn.com.yunweizhan.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Weizhan▪Yun
 * @date 2022/4/26 21:10
 */
class Solution1283Tests {
	private final Solution1283 instance = new Solution1283();

	@Test
	void smallestDivisor() {
		test(new int[] {1, 2, 5, 9}, 6);
	}

	@Test
	void smallestDivisor1() {
		test(new int[] {2, 3, 5, 7, 11}, 11);
	}

	@Test
	void smallestDivisor2() {
		test(new int[] {19}, 5);
	}

	private void test(int[] nums, int threshold) {
		System.out.println(instance.smallestDivisor(nums, threshold));
	}
}