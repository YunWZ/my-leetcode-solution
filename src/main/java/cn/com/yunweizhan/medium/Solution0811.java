package cn.com.yunweizhan.medium;

public class Solution0811 {
    private static final int mod = 1000000007;
    int[] coins = {25, 10, 5, 1};

    public int waysToChange(int n) {
        int[] f = new int[n + 1];
        f[0] = 1;
        for (int i = 0; i < 4; i++) {
            int coin = coins[i];
            for (int j = coin; j <= n; j++) {
                f[j] = (f[j] + f[j - coin]) % mod;
            }
        }

        return f[n];
    }

    public static void main(String[] args) {
        int n =10;
        Solution0811 solution0811 = new Solution0811();
        System.out.println(solution0811.waysToChange(n));
    }
}
