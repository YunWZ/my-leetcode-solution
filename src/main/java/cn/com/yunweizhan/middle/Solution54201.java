package cn.com.yunweizhan.middle;

public class Solution54201 {
    int[][] matrix;
    //记录每个元素到最近的 0 的距离
    int[][] dis;

    public int[][] updateMatrix(int[][] matrix) {
        this.matrix = matrix;
        dis = new int[matrix.length][matrix[0].length];
        //初始化距离数组
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                dis[i][j] = Integer.MAX_VALUE;
            }
        }

        //依次搜索matrix[i][j]为0的元素，从该元素出发计算其他非零元素的距离
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                //如果元素为0，则从该元素出发更新它所能到达(元素不为0）的其他元素的最近距离
                if (matrix[i][j] == 0) {
                    //标记此元素已经遍历过
                    dis[i][j] = 0;
                    //遍历从该元素出发所有可达的非零元素，计算其距离
                    updateMatrix(i - 1, j, 0);
                    updateMatrix(i + 1, j, 0);
                    updateMatrix(i, j - 1, 0);
                    updateMatrix(i, j + 1, 0);
                }
            }
        }
        return dis;
    }

    private void updateMatrix(int i, int j, int disc) {
        //判断数组下标i,j是否越界
        if (i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length)
            return;
        //该元素到本次0元素的距离
        int newDisc = disc + 1;
        //如果当前元素是0，且该元素的距离为Integer.MAX_VALUE，说明从它出发的非零元素距离还没有计算过，则进行递归处理
        if (matrix[i][j] == 0 && dis[i][j] == Integer.MAX_VALUE) {
            dis[i][j] = 0;
            updateMatrix(i - 1, j, 0);
            updateMatrix(i + 1, j, 0);
            updateMatrix(i, j - 1, 0);
            updateMatrix(i, j + 1, 0);
        } else if (newDisc < dis[i][j]) {
            dis[i][j] = newDisc;
            updateMatrix(i - 1, j, newDisc);
            updateMatrix(i + 1, j, newDisc);
            updateMatrix(i, j - 1, newDisc);
            updateMatrix(i, j + 1, newDisc);
        }
    }

    public static void main(String[] args) {
        Solution54201 solution54201 = new Solution54201();
        int[][] source = {
                {0, 0, 0,},
                {0, 1, 0,},
                {1, 1, 1,}
        };
        int[][] ints = solution54201.updateMatrix(source);
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[0].length; j++) {
                System.out.printf("%d\t", ints[i][j]);
            }

            System.out.println();
        }
    }
}
