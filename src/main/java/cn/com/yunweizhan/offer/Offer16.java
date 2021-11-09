package cn.com.yunweizhan.offer;

/**
 * 实现 pow(x, n) ，即计算 x 的 n 次幂函数（即，xn）。不得使用库函数，同时不需要考虑大数问题。
 */
public class Offer16 {
	public double myPow(double x, int n) {
		if (n == 0)
			return 1;

		if (n < 0) {
			x = 1 / x;
			n = -n;
		}

		double res = 1;
		while (n != 0) {
			if ((n & 1) != 0) {
				res *= x;
			}
			x *= x;
			n >>>= 1;
		}

		return res;
	}

	public static void main(String[] args) {
		extracted(2.00000, 10);
		extracted(2.10000, 3);
		extracted(2.00000, -2);
	}

	private static void extracted(double x, int n) {
		Offer16 offer16 = new Offer16();
		System.out.println(offer16.myPow(x, n));
	}
}
