package cn.com.yunweizhan.medium;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 腐烂的橘子
 *
 * @author Weizhan▪Yun
 * @date 2022/7/7 09:53
 */
public class Solution994 {
	private static final int[][] NEIGHBOR = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

	public int orangesRotting(int[][] grid) {
		int count = 0, m = grid.length, n = grid[0].length;
		Queue<Peer> queue = new LinkedList<>();

		//init
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == 1) {
					count++;
				}
				else if (grid[i][j] == 2) {
					queue.add(new Peer(i, j));
				}
			}
		}

		//

		int deep = 0;
		while (count > 0 && !queue.isEmpty()) {
			deep++;
			int length = queue.size();
			for (int i = 0; i < length; i++) {
				Peer item = queue.poll();
				for (int[] ints : NEIGHBOR) {
					int x = item.x + ints[0], y = item.y + ints[1];
					if (x < 0 || y < 0 || x >= m || y >= n) {
						continue;
					}

					if (grid[x][y] == 1) {
						count--;
						grid[x][y] = 2;
						queue.add(new Peer(x, y));

					}
				}
			}
		}

		return count > 0 ? -1 : deep;
	}

	private static class Peer {
		int x, y;

		Peer(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
