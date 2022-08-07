package cn.com.yunweizhan.easy;

/**
 * @author Weizhan▪Yun
 * @date 2022/8/7 10:51
 */
public class Solution598 {
	public int maxCount(int m, int n, int[][] ops) {
		int x = m, y = n;
		if (ops.length == 0 || ops[0].length == 0) {
			return m * n;
		}
		for (int[] op : ops) {
			x = Math.min(op[0], x);
			y = Math.min(y, op[1]);
		}

		return x * y;
	}
}
