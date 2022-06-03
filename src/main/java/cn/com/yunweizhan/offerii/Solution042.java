package cn.com.yunweizhan.offerii;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Weizhan▪Yun
 * @date 2022/5/24 09:12
 */
public class Solution042 {
	static class RecentCounter {

		private static final int SLOT = 3000;
		private final Queue<Integer> time;

		public RecentCounter() {
			time = new LinkedList<>();
		}

		public int ping(int t) {
			time.offer(t);
			while (!time.isEmpty() && time.peek() < (t - SLOT)) {
				time.poll();
			}

			return time.size();
		}
	}
}
