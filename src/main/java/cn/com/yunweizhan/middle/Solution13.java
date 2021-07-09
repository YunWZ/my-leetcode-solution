package cn.com.yunweizhan.middle;

public class Solution13 {
    private boolean[][] marked;
    private int m, n, k;

    public int movingCount(int m, int n, int k) {
        this.m = m;
        this.n = n;
        this.k = k;
        marked = new boolean[m][n];

        return movingCount(0, 0);
//        return movingCount(0, 0, 0, 0);
    }

    private int movingCount(int i, int j, int si, int sj) {
        if (i >= m || j >= n || k < si + sj || marked[i][j])
            return 0;
        marked[i][j]=true;
        return 1 + movingCount(i+1,j,(i+1)%10!=0?si+1:si-8,sj) + movingCount(i,j+1,si,(j + 1) % 10 != 0 ? sj + 1 : sj - 8);
    }

    private int movingCount(int i, int j) {
        if (!isAvailable(i, j) || marked[i][j])
            return 0;
        marked[i][j] = true;
        int res = movingCount(i, j - 1) + movingCount(i, j + 1) + movingCount(i - 1, j) + movingCount(i + 1, j) + 1;
        return res;
    }

    private boolean isAvailable(int i, int j) {
        if (i >= 0 && i < m && j >= 0 && j < n) {
            int temp = i;
            int sum = 0;
            while (temp / 10 != 0) {
                sum += temp % 10;
                temp /= 10;
            }
            sum += temp;
            temp = j;
            while (temp / 10 != 0) {
                sum += temp % 10;
                temp /= 10;
            }
            sum += temp;
            return sum <= k;
        }

        return false;
    }

    public static void main(String[] args) {
        int m = 2, n = 3, k = 1;
//        int m = 3, n = 2, k = 17;
        Solution13 solution13 = new Solution13();
        System.out.println(solution13.movingCount(m, n, k));
    }
}
