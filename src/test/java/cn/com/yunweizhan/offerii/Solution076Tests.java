package cn.com.yunweizhan.offerii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Weizhan▪Yun
 * @date 2022/5/3 20:05
 */
class Solution076Tests {
	public static final Solution076 instance = new Solution076();

	@Test
	void findKthLargest() {
		test(new int[] {3, 2, 1, 5, 6, 4}, 2, 5);
	}

	private void test(int[] nums, int k, int expected) {
		assertEquals(expected, instance.findKthLargest(nums, k));
	}
}