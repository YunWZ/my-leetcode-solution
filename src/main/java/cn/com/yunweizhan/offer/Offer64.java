package cn.com.yunweizhan.offer;

/**
 * 求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 */
public class Offer64 {
	public int sumNums(int n) {
		boolean temp = n > 1 && (n += sumNums(n - 1)) > 0;
		return n;
	}
}
