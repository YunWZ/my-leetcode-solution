package com.github.ywz.middle;

public class Solution200 {
    char[][] grid;
    int row, col;
    int[] rows = {-1, 1, 0, 0};
    int[] cols = {0, 0, -1, 1};

    public int numIslands(char[][] grid) {
        if (grid.length == 0 || grid[0].length == 0)
            return 0;
        this.grid = grid;
        row = grid.length;
        col = grid[0].length;
        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] != '0') {
                    dfs(i, j);
                    count++;
                }
            }
        }
        return count;
    }

    private void dfs(int i, int j) {
        if (i < 0 || i >= row || j < 0 || j >= col || grid[i][j] == '0')
            return;
        grid[i][j] = '0';
        for (int k = 0; k < 4; k++) {
            dfs(i + rows[k], j + cols[k]);
        }
    }

    public static void main(String[] args) {
        String s1 = "11000";
        String s2 = "11000";
        String s3 = "00100";
        String s4 = "00011";
        char[][] grid = new char[][]{
                s1.toCharArray(), s2.toCharArray(), s3.toCharArray(), s4.toCharArray()
        };

        Solution200 solution200 = new Solution200();
        System.out.println(solution200.numIslands(grid));
    }
}
