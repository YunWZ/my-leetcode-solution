package cn.com.yunweizhan.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Weizhan▪Yun
 * @date 2022/7/17 21:13
 */
class Solution1340Tests {
	private static final Solution1340 INSTANCE = new Solution1340();

	@Test
	void maxJumps() {
		test(new int[] {6, 4, 14, 6, 8, 13, 9, 7, 10, 6, 12}, 2, 4);
		test(new int[] {3, 3, 3, 3, 3}, 3, 1);
		test(new int[] {7, 6, 5, 4, 3, 2, 1}, 1, 7);
		test(new int[] {7, 1, 7, 1, 7, 1}, 2, 2);
		test(new int[] {66}, 1, 1);
		test(new int[] {22, 29, 52, 97, 29, 75, 78, 2, 92, 70, 90, 12, 43, 17, 97, 18, 58, 100, 41, 32},
				17, 6);
	}

	private void test(int[] arr, int d, int expected) {
		assertEquals(expected, INSTANCE.maxJumps(arr, d));
	}
}