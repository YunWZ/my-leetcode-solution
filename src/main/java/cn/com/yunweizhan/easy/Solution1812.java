package cn.com.yunweizhan.easy;

/**
 * @author Weizhan▪Yun
 * @date 2022/3/22 18:41
 */
public class Solution1812 {
	public boolean squareIsWhite(String coordinates) {
		int c = coordinates.charAt(0) - 'a', n = coordinates.charAt(1) - 1;
		return (c + n) % 2 == 1;
	}
}
