package cn.com.yunweizhan.medium;

import cn.com.yunweizhan.BaseTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Weizhan▪Yun
 * @date 2022/3/31 18:08
 */
class Solution33Tests extends BaseTests {
	private Solution33 instance = new Solution33();

	@Test
	void search1() {
		test(new int[] {4, 5, 6, 7, 0, 1, 2}, 0, 4);
	}

	@Test
	void search2() {
		test(new int[] {4, 5, 6, 7, 0, 1, 2}, 3, -1);
	}

	@Test
	void search3() {
		test(new int[] {1}, 0, -1);
	}

	private void test(int[] nums, int target, int experted) {
		assertEquals(instance.search(nums, target), experted);
	}
}