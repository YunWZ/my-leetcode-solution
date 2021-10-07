package cn.com.yunweizhan.easy;

public class Solution1784 {
	public boolean checkOnesSegment(String s) {
		return !s.contains("01");
	}


	public static void main(String[] args) {
/*		Solution1784 solution1784 = new Solution1784();
		String s = "1001";
		String s1 = "110";
		String s2 = "11011";
		System.out.println(solution1784.checkOnesSegment(s));
		System.out.println(solution1784.checkOnesSegment(s1));
		System.out.println(solution1784.checkOnesSegment(s2));*/
		System.out.println(testFinally());
	}

	public static int testFinally() {
		int i = 0;
		try {
			i = 1;
			throw new IllegalAccessException();
//			return i;
		}
		catch (Exception e) {
			i = -1;
		}
		finally {
			i = 2;
		}

		return i;
	}
}
