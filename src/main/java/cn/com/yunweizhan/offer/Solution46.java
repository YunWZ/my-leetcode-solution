package cn.com.yunweizhan.offer;

public class Solution46 {
	public int translateNum(int num) {
		int current = num % 10;
		int temp, a = 1, b = 1;
		while (num != 0) {
			num /= 10;
			temp = num % 10;
			int tem = 10 * temp + current;
			int c = (10 <= tem && tem <= 25) ? a + b : b;
			a = b;
			b = c;
			current = temp;
		}
		return a;
	}

	public static void main(String[] args) {
		test();
	}

	private static void test() {
		Solution46 solution46 = new Solution46();
		int test = 12258;
		System.out.println(solution46.translateNum(test));
	}
}
