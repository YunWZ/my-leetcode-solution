package cn.com.yunweizhan.offer;

public class Solution12 {
	private boolean[][] visited;
	private char[][] board;
	private String word;
	private int rowLength;
	private int colLength;

	public boolean exist(char[][] board, String word) {
		this.rowLength = board.length;
		this.colLength = board[0].length;

		this.visited = new boolean[rowLength][colLength];
		this.board = board;
		this.word = word;

		for (int i = 0; i < rowLength; i++) {
			for (int j = 0; j < colLength; j++) {
				if (exist(i, j, 0))
					return true;
			}
		}

		return false;
	}

	private boolean exist(int row, int col, int index) {
		if (row < 0 || row == rowLength || col < 0 || col == colLength || visited[row][col] || (board[row][col] != word.charAt(index)))
			return false;

		visited[row][col] = true;
		int nextIndex = index + 1;
		if (index == word.length() - 1 || exist(row - 1, col, nextIndex) || exist(row + 1, col, nextIndex) || exist(row, col - 1, nextIndex) || exist(row, col + 1, nextIndex)) {
			return true;
		}

		visited[row][col] = false;
		return false;
	}

	public static void main(String[] args) {
		test1();
	}

	private static void test1() {
		Solution12 solution12 = new Solution12();
		char[][] board = {
				{'A', 'B', 'C', 'E'},
				{'S', 'F', 'C', 'S'},
				{'A', 'D', 'E', 'E'}
		};
		String word = "ABCCED";
		System.out.println(solution12.exist(board, word));
	}
}
