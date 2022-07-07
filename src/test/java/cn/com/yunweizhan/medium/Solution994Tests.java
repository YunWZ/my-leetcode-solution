package cn.com.yunweizhan.medium;

import cn.com.yunweizhan.BaseTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Weizhan▪Yun
 * @date 2022/7/7 10:49
 */
public class Solution994Tests extends BaseTests {

	@Test
	public void orangesRotting() {
		test(new int[][] {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}}, 4);
		test(new int[][] {{2, 1, 1}, {0, 1, 1}, {1, 0, 1}}, -1);
		test(new int[][] {{0, 2}}, 0);
	}

	public void test(int[][] grid, int ex) {
		Solution994 solution994 = new Solution994();
		assertEquals(ex, solution994.orangesRotting(grid));
	}
}