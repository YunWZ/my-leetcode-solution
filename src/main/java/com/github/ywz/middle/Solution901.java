package com.github.ywz.middle;

public class Solution901 {


}

class StockSpanner {

    int[] prices = new int[150000];
    int index = 0;

    public StockSpanner() {
    }

    public int next(int price) {
        int sum = 0;
//        prices.add(0, price);
        for (Integer pc : prices) {
            if (pc <= price)
                sum++;
            else break;
        }

        return sum;
    }
}