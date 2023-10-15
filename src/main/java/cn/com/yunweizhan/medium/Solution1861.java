package cn.com.yunweizhan.medium;

public class Solution1861 {
	public char[][] rotateTheBox(char[][] box) {
		int m = box.length;
		int n = box[0].length;
		if (m == 0 || n == 0) {
			return box;
		}

		for (int i = 0; i < m; i++) {
			int pos = n;
			for (int j = n - 1; j >= 0; j--) {
				if (box[i][j] == '#') {
					box[i][pos--] = '#';
					if (j != pos) {
						box[i][j] = '.';
					}
				}
				else if (box[i][j] == '*') {
					pos = j - 1;
				}
			}
		}
		char[][] res = new char[n][m];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				res[n - i][m - j] = box[i][j];
			}
		}

		return box;
	}

	private void store(char[][] res, int newRow, int newCol, char c) {
		res[newRow][newCol] = c;
	}

}
