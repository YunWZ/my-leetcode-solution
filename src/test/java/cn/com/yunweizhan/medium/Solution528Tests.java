package cn.com.yunweizhan.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Weizhan▪Yun
 * @date 2022/8/20 16:09
 */
class Solution528Tests {

	@Test
	void pickIndex() {
		Solution528 instance = new Solution528(new int[] {1});
		assertEquals(0, instance.pickIndex());
	}
}