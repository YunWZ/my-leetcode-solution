package com.github.ywz.middle;

import java.net.InetSocketAddress;

public class Solution983 {
    private int[] days, costs;
    private Integer[] memo;
    private int[] durations = new int[]{1, 7, 30};

    public int mincostTickets(int[] days, int[] costs) {
        this.days = days;
        this.costs = costs;
        memo = new Integer[days.length];

        return dp(0);
    }

    private int dp(int i) {
        if (i >= memo.length)
            return 0;
        if (memo[i] != null)
            return memo[i];

        memo[i] = Integer.MAX_VALUE;
        int j = i +1;
        for (int k = 0; k < 3; k++) {
            while (j < days.length && (days[j] < days[i] + durations[k])) {
                j++;
            }
            memo[i] = Math.min(memo[i], dp(j) + costs[k]);
        }

        return memo[i];
    }

    public static void main(String[] args) {
        Solution983 solution983 = new Solution983();
        int[] days = {1,2,3,4,5,6,7,8,9,10,30,31}, costs = {2, 7, 15};
        System.out.println(solution983.mincostTickets(days, costs));
    }
}
