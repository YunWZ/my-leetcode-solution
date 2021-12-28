package cn.com.yunweizhan.utils;

import java.util.StringJoiner;

public class StringUtil {
	public static <T> String array(int[] nums) {
		StringJoiner stringJoiner = new StringJoiner(",", "[", "]");
		if (nums != null && nums.length != 0) {
			for (int num : nums) {
				stringJoiner.add(String.valueOf(num));
			}
		}
		else {
			stringJoiner.add("null");
		}

		return stringJoiner.toString();
	}
}
