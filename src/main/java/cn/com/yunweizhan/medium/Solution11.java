package cn.com.yunweizhan.medium;

public class Solution11 {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left != right) {
            max = Math.max(max, Math.min(height[left], height[right]) * (right - left));
            if (height[left] <= height[right])
                left++;
            else
                right--;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        Solution11 solution11 = new Solution11();
        System.out.println(solution11.maxArea(height));
    }
}
