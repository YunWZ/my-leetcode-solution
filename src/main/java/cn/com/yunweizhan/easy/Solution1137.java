package cn.com.yunweizhan.easy;

import java.util.Arrays;

public class Solution1137 {
	public int tribonacci(int n) {
		if (n < 2)
			return n;
		int[] fib = new int[n + 1];
		Arrays.fill(fib, 0);
		fib[2] = fib[1] = 1;
		if (n == 2)
			return fib[n];
		for (int i = 3; i < n + 1; i++) {
			fib[i] = fib[i - 1] + fib[i - 2] + fib[i - 3];
		}

		return fib[n];
	}
}
