package cn.com.yunweizhan.offer;

/**
 * 一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。
 *
 */
public class Offer56i {
	public int[] singleNumbers(int[] nums) {
		int diffbit = 0;
		for (int num : nums) {
			diffbit ^= num;
		}
		int mash = 1;
		while ((mash & diffbit) == 0)
			mash <<= 1;

		int diffA = 0, diffB = 0;
		for (int num : nums) {
			if ((num & mash) == 0)
				diffA ^= num;
			else diffB ^= num;
		}
		return new int[] {diffA, diffB};
	}


	public static void main(String[] args) {
		test(new int[] {4, 1, 4, 6});
	}

	private static void test(int[] ints) {
		Offer56i offer56i = new Offer56i();
		int[] res = offer56i.singleNumbers(ints);
		System.out.println(res);
	}
}
