package cn.com.yunweizhan.medium;

public class Solution576 {
	private static final int BOUND = 1_000_000_007;
	private static final int[][] MOVE = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
	private int[][] cost;

	int m, n;

	private void reBound(int i, int k) {
		if (cost[i][k] > BOUND)
			cost[i][k] %= BOUND;
	}

	private int getIndex(int row, int column) {
		return row * n + column;
	}

	public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
		this.m = m;
		this.n = n;
		this.cost = new int[m * n][maxMove + 1];

		for (int i = 0; i < m; i++) {
			for (int k = 1; k <= maxMove; k++) {
				cost[getIndex(i, 0)][k]++;
				cost[getIndex(i, n - 1)][k]++;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int k = 1; k <= maxMove; k++) {
				cost[getIndex(0, i)][k]++;
				cost[getIndex(m - 1, i)][k]++;
			}
		}

		for (int k = 1; k <= maxMove; k++) {
			for (int index = 0; index < m * n; index++) {
				int row = index / n, column = index % n;
				for (int[] ints : MOVE) {
					int preRow = row + ints[0], preColumn = column + ints[1];
					if (preRow < 0 || preRow >= m || preColumn < 0 || preColumn >= n) continue;
					cost[index][k] += cost[getIndex(preRow, preColumn)][k - 1];
					reBound(index, k);
				}
			}
		}

		return cost[getIndex(startRow, startColumn)][maxMove];
	}
}
