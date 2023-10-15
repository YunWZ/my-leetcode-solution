package cn.com.yunweizhan.easy;

public class Solution1880 {
	public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
		return toInt(firstWord) + toInt(secondWord) == toInt(targetWord);
	}

	private int toInt(String word) {
		int sum = 0;
		for (char c : word.toCharArray()) {
			sum = sum * 10 + toInt(c);
		}
		System.out.println("word: '" + word + "', sum=" + sum);
		return sum;
	}

	private int toInt(char c) {
		return c - 97;
	}
}
