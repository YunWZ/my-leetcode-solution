package cn.com.yunweizhan.middle;

public class Solution289 {
    private int boardRow;
    private int boardCol;
    private static int[] rows = {-1, -1, -1, 0, 0, 1, 1, 1};
    private static int[] cols = {-1, 0, 1, -1, 1, -1, 0, 1};

    public void gameOfLife(int[][] board) {
        boardRow = board.length;
        boardCol = board[0].length;
        for (int i = 0; i < boardRow; i++) {
            for (int j = 0; j < boardCol; j++) {
                int sum = 0;
                for (int k = 0; k < 8; k++) {
                    int row = i + rows[k];
                    int col = j + cols[k];
                    boolean result = false;
                    if (row >= 0 && col >= 0 && row < boardRow && col < boardCol) {
                        result = true;
                    }
                    if (result)
                        sum += (board[row][col] & 1);
                }
                if (board[i][j] == 1) {
                    if (sum == 2 || sum == 3) {
                        board[i][j] = board[i][j] | 2;
                    }
                } else if (sum == 3) {
                    board[i][j] = board[i][j] | 2;
                }
            }
        }
        for (int i = 0; i < boardRow; i++) {
            for (int j = 0; j < boardCol; j++) {
                board[i][j] = board[i][j] >> 1;
            }
        }
    }
/*    private int round(int row, int col) {
        return live(row, col - 1) + live(row, col + 1) + live(row - 1, col) + live(row + 1, col) + live(row - 1, col - 1) + live(row - 1, col + 1) + live(row + 1, col - 1) + live(row + 1, col + 1);
    }*/

    public static void main(String[] args) {
        Solution289 solution289 = new Solution289();
        int[][] board = {
                {0, 1, 0},
                {0, 0, 1},
                {1, 1, 1},
                {0, 0, 0}
        };
        solution289.gameOfLife(board);
        for (int i = 0; i < board.length; i++) {
            System.out.println();
            for (int j = 0; j < board[0].length; j++) {
                System.out.printf("%d\t", board[i][j]);
            }
        }
    }
}
