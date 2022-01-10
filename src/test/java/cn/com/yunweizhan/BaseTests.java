package cn.com.yunweizhan;

import java.util.StringJoiner;

public class BaseTests {
	public <T> String printArray(T[] array) {
		StringJoiner stringJoiner = new StringJoiner(",", "[", "]");
		for (T t : array) {
			stringJoiner.add(t.toString());
		}
		String x = stringJoiner.toString();
		System.out.println(x);
		return x;
	}

	public static String printArray(int[] array) {
		StringJoiner stringJoiner = new StringJoiner(",", "[", "]");
		for (int t : array) {
			stringJoiner.add(Integer.toString(t));
		}
		String x = stringJoiner.toString();
		System.out.println(x);
		return x;
	}

	public static void print(int i) {
		System.out.println("Test result: " + i);
	}
}
