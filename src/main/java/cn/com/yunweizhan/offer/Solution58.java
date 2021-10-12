package cn.com.yunweizhan.offer;

public class Solution58 {
	public String reverseLeftWords(String s, int n) {
		String firstStr = s.substring(n);
		return firstStr + s.substring(0, n);
	}
}
