package cn.com.yunweizhan.easy;

import cn.com.yunweizhan.BaseTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Weizhan▪Yun
 * @date 2022/3/22 21:31
 */
class Solution1812Tests extends BaseTests {
	private static final Solution1812 instance = new Solution1812();

	@Test
	void squareIsWhite() {
		System.out.println(instance.squareIsWhite("h3"));
	}
}