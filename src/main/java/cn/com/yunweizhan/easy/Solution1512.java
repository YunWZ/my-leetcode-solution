package cn.com.yunweizhan.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution1512 {
	public int numIdenticalPairs(int[] nums) {
		Map<Integer, List<Integer>> indexMap = new HashMap<>();
		for (int index = 0; index < nums.length; index++) {
			List<Integer> integers = indexMap.computeIfAbsent(nums[index], k -> new ArrayList<>());
			integers.add(index);
		}
		return indexMap.values().stream().filter(i -> i.size() > 1).map(list -> {
			int size = list.size();
			return size * (size - 1) / 2;
		}).reduce(0, (a, b) -> a + b);
	}

	public static class demo {
		private volatile int state = 1;

		public void test() {
			Thread t1 = new Thread(() -> {
				while (state <= 100) {
					if (state % 3 == 1) {
						System.out.println("hello");
						state += 1;
					}
				}
			});
			Thread t2 = new Thread(() -> {
				while (state <= 100) {
					if (state % 3 == 2) {
						System.out.println("hello");
						state += 1;
					}
				}
			});
			Thread t3 = new Thread(() -> {
				while (state <= 100) {
					if (state % 3 == 0) {
						System.out.println("hello");
						state += 1;
					}
				}
			});

			t1.start();
			t2.start();
			t3.start();
		}
	}

}
