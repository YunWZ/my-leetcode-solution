package cn.com.yunweizhan.offer;

public class Solution05 {
	public String replaceSpace(String s) {
		if (s == null || s.length() == 0)
			return s;
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			stringBuilder.append(c == ' ' ? "%20" : c);
		}

		return stringBuilder.toString();
	}
}
