package cn.com.yunweizhan.high;

import java.util.HashSet;
import java.util.Set;

public class Solution84 {
    public int largestRectangleArea(int[] heights) {
        int weight = 0;
        Set<Integer> heightSet = new HashSet<>();
        int ans = 0;
        for (int i : heights) {
            heightSet.add(i);
        }
        for (Integer height : heightSet) {
            for (int i = 0; i < heights.length; i++) {
                if (heights[i] < height) {
                    if (weight != 0) {
                        ans = Math.max(ans, height * weight);
                    }
                    weight = 0;
                } else {
                    weight++;
                }
            }
            ans = Math.max(ans, height * weight);
            weight = 0;
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution84 solution84 = new Solution84();
        int[] heights = {2, 1, 5, 6, 2, 3};
        System.out.println(solution84.largestRectangleArea(heights));
    }
}
