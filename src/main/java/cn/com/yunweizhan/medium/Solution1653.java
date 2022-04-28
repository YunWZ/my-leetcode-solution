package cn.com.yunweizhan.medium;

/**
 * 使字符串平衡的最少删除次数
 *
 * @author Weizhan▪Yun
 * @date 2022/4/28 22:06
 */
public class Solution1653 {

	public int minimumDeletions(String s) {

		//需要删除的次数
		int ans = 0;
		//记录b出现的次数
		int pre_b = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != 'a') {
				pre_b++;
			}
			//如果s[i]=='a',则判断当前位置之前是否出现过'b'字符(也就是pre_b不为零),如果不存在则不需要进行删除操作;如果存在'b'字符,
			//则需要删除'b'或'a'字符,因此需要将删除次数+1,同时可以认为当前的'a'字符和它之前出现的'b'字符相互抵消了(注意只是抵消1个'b'字符),
			//因此把前缀b字符的个数-1.
			else if (pre_b != 0) {
				ans++;
				pre_b--;
			}
		}

		return ans;
	}
}
