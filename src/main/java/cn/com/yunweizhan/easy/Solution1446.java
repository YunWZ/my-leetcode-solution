package cn.com.yunweizhan.easy;

/**
 * @author Weizhan▪Yun
 * @date 2022/8/7 11:45
 */
public class Solution1446 {
	public int maxPower(String s) {
		int n = s.length(), ans = 1;
		for (int i = 0; i < n; ) {
			int j = i;
			while (j < n && s.charAt(i) == s.charAt(j)) {
				j++;
			}
			ans = Math.max(ans, j - i);
			i = j;
		}

		return ans;
	}
}
