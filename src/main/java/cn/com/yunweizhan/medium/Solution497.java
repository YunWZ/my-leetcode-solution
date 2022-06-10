package cn.com.yunweizhan.medium;

import java.util.Random;

/**
 * @author Weizhan▪Yun
 * @date 2022/6/9 10:15
 */
public class Solution497 {
	int[] area;
	int[][] rects;
	private static final int AI = 0, BI = 1, XI = 2, YI = 3;
	Random random;
	int sum;

	public Solution497(int[][] rects) {
		this.rects = rects;
		this.area = new int[rects.length];
		int preArea = 0;
		for (int i = 0; i < rects.length; i++) {
			int[] rect = rects[i];
			this.area[i] = preArea + Math.abs(rect[AI] - rect[XI]) * Math.abs(rect[BI] - rect[YI]);
			preArea = this.area[i];
		}
		random = new Random();
		sum = preArea;
	}

	public int[] pick() {
		var r = random.nextInt(sum) + 1;
		int index = 0;
		for (; index <= area.length; index++) {
			if (r <= area[index]) {
				break;
			}
		}

		r = index > 0 ? r - area[index - 1] : r;
		int[] rect = rects[index];
		var w = Math.abs(rect[AI] - rect[XI]);
		return new int[] {rect[AI] + r / w, rect[BI] + r % 2};
	}
}
