package cn.com.yunweizhan.medium;

import cn.com.yunweizhan.BaseTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Weizhan▪Yun
 * @date 2022/4/16 16:50
 */
class Solution962Tests extends BaseTests {
	public static final Solution962 instance = new Solution962();

	@Test
	void maxWidthRamp() {
		assertEquals(4, instance.maxWidthRamp(new int[] {6, 0, 8, 2, 1, 5}));
		assertEquals(6, instance.maxWidthRamp(new int[] {9, 8, 1, 0, 1, 9, 4, 0, 4, 1}));
	}
}