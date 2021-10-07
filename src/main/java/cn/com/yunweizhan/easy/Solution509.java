package cn.com.yunweizhan.easy;

import java.util.Arrays;

public class Solution509 {
	public int fib(int n) {
		if (n < 2)
			return n;
		int[] fib = new int[n + 1];
		Arrays.fill(fib, 0);
		fib[2] = fib[1] = 1;
		for (int i = 3; i < n + 1; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}

		return fib[n];
	}
}
