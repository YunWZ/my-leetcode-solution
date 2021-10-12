package cn.com.yunweizhan.offer;

public class Solution04 {
	public boolean findNumberIn2DArray(int[][] matrix, int target) {
		if (matrix.length == 0 || matrix[0].length == 0)
			return false;
		int maxRow = matrix.length, maxCol = matrix[0].length;
		for (int row = 0; row < maxRow; row++) {
			if (matrix[row][0] == target) return true;
			else if (matrix[row][0] > target)
				return false;

			for (int col = 1; col < maxCol; col++) {
				int item = matrix[row][col];
				if (item == target)
					return true;
				else if (item > target) {
					maxCol = col;
					break;
				}
			}
		}
		return false;
	}
}
