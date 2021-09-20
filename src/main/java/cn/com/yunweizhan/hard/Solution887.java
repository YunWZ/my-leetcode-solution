package cn.com.yunweizhan.hard;

public class Solution887 {
    int[][] memo;

    public int superEggDrop(int K, int N) {
        memo = new int[K+1][N+1];
/*        for (int i = 0; i < K; i++) {
            for (int j = 0; j < N; j++) {
                memo[i+1][j+1] = -1;
            }
        }*/
        return dp(K, N);
    }

    private int dp(int K, int N) {
        if (K == 1)
            return N;
        if (N == 0)
            return 0;
        if (memo[K][N] != 0)
            return memo[K][N];
        int lo = 1, hi = N, mid;
        int res = Integer.MAX_VALUE;
        while (lo <= hi) {
            mid = (lo + hi) / 2;
            int broken = dp(K - 1, mid - 1);
            int notBroken = dp(K, N - mid);
            if (broken > notBroken) {
                res = Math.min(res, broken + 1);
                hi = mid - 1;
            } else {
                lo = mid + 1;
                res = Math.min(res, notBroken + 1);
            }
        }
        memo[K][N] = res;
        return res;
    }

    public static void main(String[] args) {
        Solution887 solution887 = new Solution887();
        System.out.println(solution887.superEggDrop(1, 2));
    }
}
