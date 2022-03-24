package cn.com.yunweizhan.medium;

/**
 * 活字印刷
 *
 * @author Weizhan▪Yun
 * @date 2022/3/22 22:03
 */
public class Solution1079 {
	public int numTilePossibilities(String tiles) {
		int[] charTable = new int[26];
		for (int i = 0; i < tiles.length(); i++) {
			charTable[tiles.charAt(i) - 'A']++;
		}

		return dfs(charTable);
	}

	private int dfs(int[] charTable) {
		int ans = 0;
		for (int i = 0; i < 26; i++) {
			if (charTable[i] == 0) {
				continue;
			}
			ans++;
			charTable[i]--;
			ans += dfs(charTable);
			charTable[i]++;
		}

		return ans;
	}
}
