package cn.com.yunweizhan.medium;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Weizhan▪Yun
 * @date 2022/10/3 10:19
 */
public class Solution816 {
	public List<String> ambiguousCoordinates(String s) {
		List<String> ans = new LinkedList<>();

		for (int i = 2; i < s.length() - 1; i++) {
			for (String left : split(s, 1, i)) {
				for (String right : split(s, i, s.length() - 1)) {
					ans.add("(" + left + ", " + right + ")");
				}
			}
		}

		return ans;
	}

	private List<String> split(String s, int start, int end) {
		List<String> result = new LinkedList<>();

		for (int i = start + 1; i <= end; i++) {
			String left = s.substring(start, i);
			String right = s.substring(i, end);
			if ((!left.startsWith("0") || left.equals("0")) && !right.endsWith("0"))
				result.add(left + (i == end ? "" : ".") + right);
		}

		return result;
	}
}
