package cn.com.yunweizhan.easy;

public class Solution1832 {
	public boolean checkIfPangram(String sentence) {
		boolean[] alphBeta = new boolean[26];
		for (char c : sentence.toCharArray()) {
			alphBeta[c - 97] = true;
		}
		for (boolean b : alphBeta) {
			if (!b) {
				return false;
			}
		}
		return true;
	}
}
