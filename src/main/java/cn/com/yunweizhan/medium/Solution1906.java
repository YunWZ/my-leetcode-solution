package cn.com.yunweizhan.medium;

/**
 * @author Weizhan▪Yun
 * @date 2023/1/26 14:21
 */
public class Solution1906 {
    public int[] minDifference(int[] nums, int[][] queries) {
        int[][] pre = new int[nums.length + 1][101];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < 101; j++) {
                pre[i + 1][j] = pre[i][j];
            }
            pre[i + 1][nums[i]]++;
        }

        int[] ans = new int[queries.length];

        for (int j = 0; j < queries.length; j++) {
            int[] query = queries[j];
            int left = query[0], right = query[1];
            int min = Integer.MAX_VALUE, lastValue = -1;

            for (int i = 1; i < 101; i++) {
                if (pre[left][i] != pre[right][i]) {
                    if (lastValue != -1) {
                        min = Math.min(min, i - lastValue);
                    }
                    lastValue = i;
                }
            }

            ans[j] = min == Integer.MAX_VALUE ? -1 : min;
        }

        return ans;
    }
}
