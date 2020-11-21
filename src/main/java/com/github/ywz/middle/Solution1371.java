package com.github.ywz.middle;

import com.github.ywz.low.Solution572;

import java.util.Arrays;

public class Solution1371 {
    public int findTheLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int ans = 0, status = 0;
        int[] pos = new int[32];
        Arrays.fill(pos, -1);
        pos[0] = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case 'a':
                    status ^= 1;
                    break;
                case 'e':
                    status ^= 1 << 1;
                    break;
                case 'i':
                    status ^= 1 << 2;
                    break;
                case 'o':
                    status ^= 1 << 3;
                    break;
                case 'u':
                    status ^= 1 << 4;
                    break;
            }
            if (pos[status] >= 0) {
                ans = Math.max(ans, i - pos[status] + 1);
                System.out.printf("ans: %d, i: %d, l: %d\n", ans, i, pos[status]);
            } else {
                pos[status] = i+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "eleetminicoworoep";
        Solution1371 solution1371 = new Solution1371();
        solution1371.findTheLongestSubstring(s);
    }
}
