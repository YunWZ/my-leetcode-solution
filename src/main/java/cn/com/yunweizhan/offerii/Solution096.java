package cn.com.yunweizhan.offerii;

public class Solution096 {
	public boolean isInterleave(String s1, String s2, String s3) {
		int[] s3char = new int[26];
		s1.chars().forEach(i -> s3char[reindex(i)]++);
		s2.chars().forEach(i -> s3char[reindex(i)]++);
		s3.chars().forEach(i -> s3char[reindex(i)]--);
		for (int c : s3char) {
			if (c != 0)
				return false;
		}
		return true;
	}

	private int reindex(int c) {
		return c - 97;
	}

	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}

	private static void test1() {
		String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac";
		Solution096 solution096 = new Solution096();
		boolean interleave = solution096.isInterleave(s1, s2, s3);
		System.out.println(interleave);
	}

	private static void test2() {
		String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc";
		Solution096 solution096 = new Solution096();
		boolean interleave = solution096.isInterleave(s1, s2, s3);
		System.out.println(interleave);
	}

	private static void test3() {
		String s1 = "", s2 = "", s3 = "";
		Solution096 solution096 = new Solution096();
		boolean interleave = solution096.isInterleave(s1, s2, s3);
		System.out.println(interleave);
	}
}
