package cn.com.yunweizhan.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Weizhan▪Yun
 * @date 2022/6/3 21:09
 */
class Solution553Tests {
	public static final Solution553 instance = new Solution553();

	@Test
	void optimalDivision() {
		assertEquals("1000/(100/10/2)", instance.optimalDivision(new int[] {1000, 100, 10, 2}));
	}
}