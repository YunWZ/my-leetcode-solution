package cn.com.yunweizhan.offer;

/**
 * 输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
 */
public class Offer40 {
	public int[] getLeastNumbers(int[] arr, int k) {
		return new int[0];

	}

	public static void main(String[] args) {
//		test1();
		test2();
	}

	private static void test2() {
		Offer40 offer40 = new Offer40();
		int[] arr = {0, 2, 1, 1};
		int[] leastNumbers = offer40.getLeastNumbers(arr, 2);
		StringBuilder stringBuilder = new StringBuilder();
		for (int leastNumber : leastNumbers) {
			stringBuilder.append(leastNumber);
		}
		System.out.println(stringBuilder);
	}

	private static void test1() {
		Offer40 offer40 = new Offer40();
		int[] arr = {3, 2, 1};
		int[] leastNumbers = offer40.getLeastNumbers(arr, 2);
		StringBuilder stringBuilder = new StringBuilder();
		for (int leastNumber : leastNumbers) {
			stringBuilder.append(leastNumber);
		}
		System.out.println(stringBuilder);
	}

}
