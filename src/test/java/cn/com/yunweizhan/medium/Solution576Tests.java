package cn.com.yunweizhan.medium;

import cn.com.yunweizhan.BaseTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution576Tests extends BaseTests {
	private static final Solution576 solution = new Solution576();

	@Test
	void findPaths1() {
		print(run(2, 2, 2, 0, 0));
	}

	@Test
	void findPaths2() {
		print(run(1, 2, 50, 0, 0));
	}

	private int run(int m, int n, int maxMove, int startRow, int startColumn) {
		return solution.findPaths(m, n, maxMove, startRow, startColumn);
	}
}