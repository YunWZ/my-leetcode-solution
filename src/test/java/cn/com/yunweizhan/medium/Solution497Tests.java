package cn.com.yunweizhan.medium;

import cn.com.yunweizhan.BaseTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Weizhan▪Yun
 * @date 2022/6/9 10:35
 */
class Solution497Tests extends BaseTests {

	@Test
	void pick() {
		Solution497 instance = new Solution497(new int[][] {{-2, -2, 1, 1}, {2, 2, 4, 6}});
		printArray(instance.pick());
		printArray(instance.pick());
		printArray(instance.pick());
		printArray(instance.pick());
	}
}