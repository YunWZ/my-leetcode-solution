package cn.com.yunweizhan.hard;

/**
 * 接雨水
 *
 * @author Weizhan▪Yun
 * @date 2022/4/30 15:11
 */
public class Solution42 {
	public int trap(int[] height) {
		int maxLeft = 0, maxRight = 0;
		int leftIndex = 1;
		int rightIndex = height.length - 2;
		int sum = 0;
		while (leftIndex <= rightIndex) {
			if (height[leftIndex - 1] < height[rightIndex + 1]) {
				maxLeft = Math.max(maxLeft, height[leftIndex - 1]);
				if (maxLeft > height[leftIndex]) {
					sum += maxLeft - height[leftIndex];
				}
				else {
					maxLeft = height[leftIndex];
				}
				leftIndex++;
			}
			else {
				maxRight = Math.max(maxRight, height[rightIndex + 1]);
				if (maxRight > height[rightIndex]) {
					sum += maxRight - height[rightIndex];
				}
				rightIndex--;
			}
		}

		return sum;
	}
}
