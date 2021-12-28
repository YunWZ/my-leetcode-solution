package cn.com.yunweizhan.medium;

import cn.com.yunweizhan.utils.StringUtil;
import org.junit.jupiter.api.Test;

class Solution189Tests {
	private final Solution189 solution189;

	public Solution189Tests() {
		this.solution189 = new Solution189();
	}

	@Test
	public void test1() {
		int[] nums = {1, 2, 3, 4, 5, 6, 7};
		int k = 3;

		solution189.rotate(nums, k);
		System.out.println(StringUtil.array(nums));
	}
}