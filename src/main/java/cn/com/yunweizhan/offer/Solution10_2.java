package cn.com.yunweizhan.offer;

public class Solution10_2 {
	private int mod = 1_000_000_007;

	public int numWays(int n) {
		int sum, a = 1, b = 1;
		for (int i = 0; i < n; i++) {
			if ((sum = a + b) > mod)
				sum -= mod;
			a = b;
			b = sum;
		}
		return a;
	}

	public static void main(String[] args) {
		test1();
		test2();
		test3();
		test4();
	}

	public static void test1() {
		Solution10_2 solution10_2 = new Solution10_2();
		int n = 2;
		System.out.println(solution10_2.numWays(n));
	}

	public static void test2() {
		Solution10_2 solution10_2 = new Solution10_2();
		int n = 7;
		System.out.println(solution10_2.numWays(n));
	}

	public static void test3() {
		Solution10_2 solution10_2 = new Solution10_2();
		int n = 0;
		System.out.println(solution10_2.numWays(n));
	}

	public static void test4() {
		Solution10_2 solution10_2 = new Solution10_2();
		int n = 43;
		System.out.println(solution10_2.numWays(n));
	}
}
