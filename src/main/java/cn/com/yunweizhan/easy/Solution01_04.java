package cn.com.yunweizhan.easy;

public class Solution01_04 {
	public boolean canPermutePalindrome(String s) {
		char[] chars = s.toCharArray();
		int[] chr = new int[256]; int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if ((chr[s.charAt(i)]++ & 1) == 1) {
				count--;
			}
			else count++;
		}


		return count <= 1;
	}
}
