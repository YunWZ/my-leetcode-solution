package cn.com.yunweizhan.medium;

import cn.com.yunweizhan.BaseTests;
import org.junit.jupiter.api.Test;

class Solution713Tests extends BaseTests {

	private Solution713 solution713 = new Solution713();

	@Test
	void numSubarrayProductLessThanK() {
		int[] nums = {10, 5, 2, 6};
		int k = 100;
		System.out.println(solution713.numSubarrayProductLessThanK(nums, k));
	}
}