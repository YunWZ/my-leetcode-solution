package cn.com.yunweizhan.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Solution519 {
	int m, n;
	Map<Integer, Integer> cache = new HashMap<>();
	Random random;
	int rightBound;

	public Solution519(int m, int n) {
		this.m = m;
		this.n = n;
		this.rightBound = m * n;
		random = new Random();
	}

	public int[] flip() {
		if (rightBound <=0)
			return null;
		int index = random.nextInt(rightBound--);
		Integer res = cache.getOrDefault(index, index);
		cache.put(index, cache.getOrDefault(rightBound,rightBound));

		return new int[] {
				res / n, res % n
		};
	}

	public void reset() {
		rightBound = m * n;
		cache.clear();
	}
}
