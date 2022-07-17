package cn.com.yunweizhan.medium;

import java.util.Arrays;

/**
 * 拿出最少数目的魔法豆
 * <p>
 * 给你一个 正 整数数组 beans ，其中每个整数表示一个袋子里装的魔法豆的数目。
 * <p>
 * 请你从每个袋子中 拿出 一些豆子（也可以 不拿出），使得剩下的 非空 袋子中（即 至少 还有 一颗 魔法豆的袋子）魔法豆的数目 相等 。一旦魔法豆从袋子中取出，你不能将它放到任何其他的袋子中。
 * <p>
 * 请你返回你需要拿出魔法豆的 最少数目。
 *
 * @author Weizhan▪Yun
 * @date 2022/7/12 17:50
 */
public class Solution2171 {
	public long minimumRemoval(int[] beans) {
		Arrays.sort(beans);
		long sum = 0, max = 0;
		for (int i = 0; i < beans.length; i++) {
			sum += beans[i];
			max = Math.max(max, (beans.length - i) * (long) beans[i]);
		}

		return sum - max;
	}
}
