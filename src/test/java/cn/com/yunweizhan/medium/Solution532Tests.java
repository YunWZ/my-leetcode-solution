package cn.com.yunweizhan.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Weizhan▪Yun
 * @date 2022/5/12 14:10
 */
class Solution532Tests {
	public static final Solution532 INSTANCE = new Solution532();

	@Test
	void findPairs() {
		assertEquals(2, INSTANCE.findPairs(new int[] {3, 1, 4, 1, 5}, 2));
		assertEquals(4, INSTANCE.findPairs(new int[] {1, 2, 3, 4, 5}, 1));
		assertEquals(1, INSTANCE.findPairs(new int[] {1, 3, 1, 5, 4}, 0));
	}
}