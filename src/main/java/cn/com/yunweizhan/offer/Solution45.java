package cn.com.yunweizhan.offer;

public class Solution45 {
	public String minNumber(int[] nums) {
		String[] numStrs = new String[nums.length];
		for (int i = 0; i < nums.length; i++) {
			numStrs[i] = String.valueOf(nums[i]);
		}

		quickSourt(numStrs, 0, numStrs.length - 1);

		StringBuilder stringBuilder = new StringBuilder();
		for (String numStr : numStrs) {
			stringBuilder.append(numStr);
		}

		return stringBuilder.toString();
	}

	private void quickSourt(String[] numStrs, int lo, int hi) {
		if (lo >= hi) return;

		int index = lo + 1, lessIndex = lo, greatIndex = hi;
		String current = numStrs[lo];

		while (index <= greatIndex) {
			int compare = (numStrs[index] + current).compareTo(current + numStrs[index]);

			if (compare < 0) {
				String temp = numStrs[lessIndex];
				numStrs[lessIndex++] = numStrs[index];
				numStrs[index++] = temp;
			}
			else if (compare > 0) {
				String temp = numStrs[greatIndex];
				numStrs[greatIndex--] = numStrs[index];
				numStrs[index] = temp;
			}
			else {
				index++;
			}
		}

		quickSourt(numStrs, lo, lessIndex - 1);
		quickSourt(numStrs, greatIndex + 1, hi);
	}

	public static void main(String[] args) {
		test1();
		test2();
	}

	private static void test1() {
		int[] nums = {10, 2};
		Solution45 solution45 = new Solution45();
		System.out.println(solution45.minNumber(nums));
	}

	private static void test2() {
		int[] nums = {3, 30, 34, 5, 9};
		Solution45 solution45 = new Solution45();
		System.out.println(solution45.minNumber(nums));
	}
}
