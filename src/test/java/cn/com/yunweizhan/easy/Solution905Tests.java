package cn.com.yunweizhan.easy;

import cn.com.yunweizhan.BaseTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Weizhan▪Yun
 * @date 2022/3/22 18:15
 */
class Solution905Tests extends BaseTests {
	private static final Solution905 instance = new Solution905();

	@Test
	void sortArrayByParity() {
		int[] nums = {3, 1, 2, 4};
		printArray(instance.sortArrayByParity(nums));
	}

	@Test
	void sortArrayByParity2() {
		int[] nums = {0, 2};
		printArray(instance.sortArrayByParity(nums));
	}
}