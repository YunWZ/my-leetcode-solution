package cn.com.yunweizhan.medium;

/**
 *  判断一个数字是否可以表示成三的幂的和
 *  给你一个整数`n`，如果你可以将`n`表示成若干个不同的三的幂之和，请你返回`true`，否则请返回`false`。
 *
 * 对于一个整数`y`，如果存在整数`x`满足 y == 3^x ，我们称这个整数 y 是三的幂。
 *
 * @author Weizhan▪Yun
 * @date 2022/5/6 15:20
 */
public class Solution1780 {
	public boolean checkPowersOfThree(int n) {
		//转换为三进制数(不能包含2),因此只需要判断余数是否包含2.
		while (n > 0) {
			if (n % 3 == 2) {
				return false;
			}
			n /= 3;
		}

		return true;
	}
}
