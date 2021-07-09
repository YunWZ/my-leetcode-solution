package cn.com.yunweizhan.high;

public class Solution172 {
    public int minDistance(String word1, String word2) {
        int w1Length = word1.length();
        int w2Length = word2.length();
        int[][] cost = new int[w1Length + 1][w2Length + 1];
        for (int i = 1; i <= w2Length; i++) {
            cost[0][i] = i;
        }

        for (int i = 1; i <= w1Length; i++) {
            cost[i][0] = i;
        }
        for (int i = 1; i <= w1Length; i++) {
            for (int j = 1; j <= w2Length; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1))
                    cost[i][j] = cost[i - 1][j - 1];
                else
                    cost[i][j] = min(cost[i][j - 1], cost[i - 1][j - 1], cost[i - 1][j]) + 1;
            }
        }

        return cost[w1Length][w2Length];
    }

    public int min(int i, int j, int k) {
        return Math.min(i, Math.min(j, k));
    }

    public static void main(String[] args) {
        Solution172 solution172 = new Solution172();
        String word1 = "intention", word2 = "execution";
        System.out.println(solution172.minDistance(word1, word2));
    }
}
