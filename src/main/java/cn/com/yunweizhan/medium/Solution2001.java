package cn.com.yunweizhan.medium;

import java.util.HashMap;
import java.util.Map;

public class Solution2001 {
	public long interchangeableRectangles(int[][] rectangles) {
		if (rectangles.length < 2)
			return 0;

		Map<String, Integer> map = new HashMap<>();
		for (int[] rectangle : rectangles) {
			int width = rectangle[0], height = rectangle[1];
			String key = key(width, height);
			map.compute(key, (k, v) -> {
				if (v == null) {
					return 1;
				}

				return ++v;
			});
		}

		if (map.isEmpty())
			return 0;
		int res = 0;
		for (Map.Entry<String, Integer> doubleIntegerEntry : map.entrySet()) {
			Integer value = doubleIntegerEntry.getValue();
			res += value * (value - 1) / 2;
		}

		return res;
	}

	private String key(int width, int height) {
		int gcd = gcd(width, height);
		return (width / gcd) + "-" + height / gcd;
	}

	private int gcd(int width, int height) {
		if (width < height) return gcd(height, width);
		else {
			int retain;
			if ((retain = width % height) == 0)
				return height;
			else return gcd(height, retain);
		}
	}

	public static void main(String[] args) {
		int[][] rectangles = {{4, 8}, {3, 6}, {10, 20}, {15, 30}};
		Solution2001 solution2001 = new Solution2001();
		System.out.println(solution2001.interchangeableRectangles(rectangles));
	}
}
