package com.github.ywz.middle;

public class Solution0107 {
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int temp;

        for (int j = 0; j < row / 2; j++) {
            for (int i = 0; i < row; i++) {
                temp = matrix[i][row - 1 - j];
                matrix[i][row - 1 - j] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }

        for (int i = 0; i < row - 1; i++) {
            for (int j = 0; j < row - 1 - i; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[row - 1 - j][row - 1 - i];
                matrix[row - 1 - j][row - 1 - i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}
        };

        Solution0107 solution0107 = new Solution0107();
        solution0107.rotate(matrix);
        for (int i = 0; i < matrix.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < matrix.length; j++) {
                stringBuilder.append(matrix[i][j] + " ");
            }
            System.out.println(stringBuilder.toString());
        }
    }
}
