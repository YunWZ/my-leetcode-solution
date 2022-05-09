package cn.com.yunweizhan.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Weizhan▪Yun
 * @date 2022/5/8 11:42
 */
class Solution263Tests {
public static final Solution263 instance = new Solution263();
	@Test
	void isUgly() {
		assert instance.isUgly(6);
		assert instance.isUgly(1);
		assert !instance.isUgly(14);
	}
}