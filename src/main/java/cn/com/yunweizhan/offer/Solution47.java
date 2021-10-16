package cn.com.yunweizhan.offer;

public class Solution47 {
	public int maxValue(int[][] grid) {
		int maxRow = grid.length, maxCol = grid[0].length;
		for (int i = 1; i < maxCol; i++) {
			grid[0][i] += grid[0][i - 1];
		}
		for (int i = 1; i < maxRow; i++) {
			grid[i][0] += grid[i - 1][0];
		}

		for (int i = 1; i < maxRow; i++) {
			for (int j = 1; j < maxCol; j++) {
				grid[i][j] += Math.max(grid[i][j - 1], grid[i - 1][j]);
			}
		}

		return grid[maxRow - 1][maxCol - 1];
	}

	public static void main(String[] args) {
		test1();
	}

	private static void test1() {
		Solution47 solution47 = new Solution47();
		int[][] grid = {
				{1, 3, 1},
				{1, 5, 1},
				{4, 2, 1}
		};
		System.out.println(solution47.maxValue(grid));
	}
}
