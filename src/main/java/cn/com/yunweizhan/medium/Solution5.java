package cn.com.yunweizhan.medium;

/**
 * 最长回文子串
 * @author Weizhan▪Yun
 * @date 2022/4/2 16:54
 */
public class Solution5 {
	public String longestPalindrome(String s) {
		int length = s.length();
		if (length < 2) {
			return s;
		}

		int[] ans = new int[2];
		for (int i = 0; i < s.length() - 1; i++) {
			int[] odd = centerSpread(s, i, i);
			int[] even = centerSpread(s, i, i + 1);
			int[] temp = odd[1] > even[1] ? odd : even;
			if (ans[1] < temp[1]) {
				ans = temp;
			}
		}

		return s.substring(ans[0], ans[0] + ans[1]);
	}

	private int[] centerSpread(String s, int left, int right) {
		while (left >= 0 && right < s.length()) {
			if (s.charAt(left) == s.charAt(right)) {
				left--;
				right++;
			}
			else {
				break;
			}
		}
		return new int[] {
				left + 1, right - left - 1
		};
	}
}
