package cn.com.yunweizhan.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * 输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。
 *
 * 序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。
 */
public class Offer57ii {
	public int[][] findContinuousSequence(int target) {
		List<List<Integer>> res = new ArrayList<>();

		List<Integer> temp;
		for (int i = 1; i <= target / 2; i++) {
			temp = new ArrayList<>();
			int sum = 0;
			for (int j = i; j <= target / 2 + 1; j++) {
				temp.add(j);
				sum += j;
				if (sum == target && temp.size() > 1) {
					res.add(temp);
					break;
				}
				else if (sum > target) {
					break;
				}
			}
		}

		int[][] result = null;
		if (!res.isEmpty()) {
			result = new int[res.size()][];
			int i = 0;
			for (List<Integer> re : res) {
				int[] item = new int[re.size()];
				result[i++] = item;
				for (int j = 0; j < re.size(); j++) {
					item[j] = re.get(j);
				}
			}
		}
		else {
			result = new int[0][0];
		}

		return result;
	}

	public static void main(String[] args) {
		Offer57ii offer57ii = new Offer57ii();

		int target1 = 9;
		int target2 = 15;

		System.out.println(offer57ii.findContinuousSequence(target1));
		System.out.println(offer57ii.findContinuousSequence(target2));
	}
}
