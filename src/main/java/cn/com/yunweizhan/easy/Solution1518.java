package cn.com.yunweizhan.easy;

public class Solution1518 {
	public int numWaterBottles(int numBottles, int numExchange) {
		int result = 0;
		int cac = 0;
		while ((numBottles + cac) >= numExchange) {
			//每次喝完全部的酒
			result += numBottles;
			numBottles = (cac + numBottles) / numExchange;
			cac = (cac + numBottles) % numExchange;
		}
		result += numBottles;
		return result;
	}

	public static void main(String[] args) {
		Solution1518 solution = new Solution1518();
		System.out.println(solution.numWaterBottles(15, 8));
	}
}
