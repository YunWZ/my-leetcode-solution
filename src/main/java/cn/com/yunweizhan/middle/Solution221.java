package cn.com.yunweizhan.middle;

public class Solution221 {
    public int maximalSquare(char[][] matrix) {
        // base condition
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return 0;

        int width = matrix[0].length;
        int maxSide = 0;

        // 相当于已经预处理新增第一行、第一列均为0
        int[] dp = new int[width + 1];
        int northwest; // 西北角、左上角

        for (char[] chars : matrix) {
            northwest = 0; // 遍历每行时，还原回辅助的原值0
            for (int col = 0; col < width; col++) {
                int nextNorthwest = dp[col + 1];
                if (chars[col] == '1') {
                    dp[col + 1] = Math.min(Math.min(dp[col], dp[col + 1]), northwest) + 1;

                    maxSide = Math.max(maxSide, dp[col + 1]);
                } else {
                    dp[col + 1] = 0;
                }
                northwest = nextNorthwest;
            }
        }
        return maxSide * maxSide;

    }

    public static void main(String[] args) {
        char[][] matrix = new char[][]{
/*                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}*/
                /*{'0', '1'}*/
/*                {'1', '1'},
                {'1', '1'}*/
                {'0', '0', '0', '1'},
                {'1', '1', '0', '1'},
                {'1', '1', '1', '1'},
                {'0', '1', '1', '1'},
                {'0', '1', '1', '1'}
        };
        Solution221 solution221 = new Solution221();
        System.out.println(solution221.maximalSquare(matrix));
    }
}
