package cn.com.yunweizhan.offer;

import java.util.HashMap;
import java.util.Map;

public class Solution10_1 {
	private int mod = 1_000_000_007;

	public int fib(int n) {
		Map<Integer, Integer> res = new HashMap<>();
		res.put(0, 0);
		res.put(1, 1);

		for (int i = 2; i < n + 1; i++) {
			res.put(i, (res.get(i - 2) % mod + res.get(i - 1) % mod) % mod);
		}

		return res.get(n);
	}
}
