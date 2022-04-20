package cn.com.yunweizhan.interview;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 变位词组
 *
 * 编写一种方法，对字符串数组进行排序，将所有变位词组合在一起。变位词是指字母相同，但排列不同的字符串。
 *
 * @author Weizhan▪Yun
 * @date 2022/4/5 15:20
 */
public class Solution10_02 {
	private static final int[] primeTable;

	static {
		primeTable = new int[26];

		for (int prime = 2, index = 0; index < 26; prime++) {
			boolean isPrime = true;
			for (int i = 2; i < prime / i; i++) {
				if (prime % i == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				primeTable[index++] = prime;
			}
		}
	}

	public List<List<String>> groupAnagrams(String[] strs) {
		Map<Integer, List<String>> map = new HashMap<>();
		for (String str : strs) {
			int key = 1;
			for (int i = 0; i < str.length(); i++) {
				key *= primeTable[str.charAt(i) - 'a'];
			}

			map.compute(key, (k, v) -> {
				LinkedList<String> realValue = (LinkedList<String>) v;
				if (v == null) {
					realValue = new LinkedList<>();
				}

				realValue.add(str);
				return realValue;
			});
		}

		return map.values().stream().collect(Collectors.toList());
	}
}
