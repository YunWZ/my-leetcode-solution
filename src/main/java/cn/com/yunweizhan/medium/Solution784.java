package cn.com.yunweizhan.medium;

import java.util.LinkedList;
import java.util.List;

public class Solution784 {
	private static final int trans = 32;

	public List<String> letterCasePermutation(String s) {
		List<String> res = new LinkedList<>();

		char[] chars = s.toCharArray();

		dfs(chars, 0, res);

		return res;
	}

	private void dfs(char[] chars, int index, List<String> res) {
		if (index == chars.length) {
			res.add(new String(chars));
			return;
		}

		dfs(chars, index + 1, res);

		if (Character.isLetter(chars[index])) {
			chars[index] ^= trans;
			dfs(chars, index + 1, res);
		}
	}

}
