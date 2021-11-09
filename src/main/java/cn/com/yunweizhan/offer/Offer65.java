package cn.com.yunweizhan.offer;

/**
 * 写一个函数，求两个整数之和，要求在函数体内不得使用 “+”、“-”、“*”、“/” 四则运算符号。
 */
public class Offer65 {
	public int add(int a, int b) {
		if (b == 0)
			return a;
		return add(a ^ b, (a & b) << 1);
	}
}
