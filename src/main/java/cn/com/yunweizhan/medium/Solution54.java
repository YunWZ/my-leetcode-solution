package cn.com.yunweizhan.medium;

import java.util.ArrayList;
import java.util.List;

public class Solution54 {
	public class Solution {
		public List<Integer> spiralOrder(int[][] matrix) {
			List<Integer> result = new ArrayList<>();
			if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
				return result;
			}

			int rows = matrix.length, cols = matrix[0].length;

			int left = 0, right = cols - 1, top = 0, bottom = rows - 1;

			while (left <= right && top <= bottom) {
				for (int column = left; column <= right; column++) {
					result.add(matrix[top][column]);
				}
				for (int row = top + 1; row <= bottom; row++) {
					result.add(matrix[row][bottom]);
				}
				if (left < right && top < bottom) {
					for (int colums = right - 1; colums >= left; colums--) {
						result.add(matrix[bottom][colums]);
					}

					for (int row = bottom + 1; row > top; row--) {
						result.add(matrix[row][left]);
					}
				}

				left++;
				right--;
				top++;
				bottom--;
			}

			return result;
		}
	}
}
