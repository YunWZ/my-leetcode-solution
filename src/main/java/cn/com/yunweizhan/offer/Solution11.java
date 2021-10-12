package cn.com.yunweizhan.offer;

public class Solution11 {
	public int minArray(int[] numbers) {
		if (0 == numbers.length) return -1;
		int firstItem = numbers[0];
		int min = numbers[0];
		boolean reverse = false;
		for (int i = numbers.length - 1; i >= 1; i--) {
			if (numbers[i] < firstItem) {
				reverse = true;
				min = numbers[i];
			}
			else if (reverse) {
				return min;
			}
		}

		return min;
	}

	public static void main(String[] args) {
		Solution11 solution11 = new Solution11();
		int[] test1 = {3, 4, 5, 1, 2};
		int[] test2 = {2, 2, 2, 0, 1};
		int[] test3 = {1, 3, 5};
		int[] test4 = {};

		System.out.println(solution11.minArray(test1));
		System.out.println(solution11.minArray(test2));
		System.out.println(solution11.minArray(test3));
	}
}
