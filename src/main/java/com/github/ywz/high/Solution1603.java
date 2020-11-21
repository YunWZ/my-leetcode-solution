package com.github.ywz.high;

import com.sun.org.apache.regexp.internal.RE;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Solution1603 {
    public double[] intersection(int[] start1, int[] end1, int[] start2, int[] end2) {
        double k1 = ((double) (end1[1] - start1[1])) / (end1[0] - start1[0]);
        double k2 = ((double) end2[1] - start2[1]) / (end2[0] - start2[0]);
        double c2 = start2[1] - k2 * start2[0];
        double c1 = start1[1] - k1 * start1[0];
        if (k1 != k2 || (k1 * start2[0] + c1 == start2[1])) {
            if ((k1 * start2[0] + c1 == start2[1]) && c1 == c2) {
                int[] temp = start1[0] < end1[0] ? start1 : end1;
                temp = temp[0] < start2[0] ? temp : start2;
                temp = temp[0] < end2[0] ? temp : end2;
                return new double[]{temp[0], temp[1]};
            }
            double x = (c2 - c1) / (k1 - k2);
            double y = k1 * x + c1;
            return new double[]{x, y};
        }
        return new double[]{};
    }

    public static void main(String[] args) {
        int[] start1 = {0, 0};
        int[] end1 = {3, 3};
        int[] start2 = {1, 1};
        int[] end2 = {2, 2};
        Solution1603 solution1603 = new Solution1603();
        double[] intersection = solution1603.intersection(start1, end1, start2, end2);
        if (intersection.length > 0) {
            System.out.printf("%s %s", intersection[0], intersection[1]);
        }
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(11);
        arrayBlockingQueue.add(1);
        try {
            arrayBlockingQueue.put(1);
            arrayBlockingQueue.offer(1);
            arrayBlockingQueue.offer(1,1, TimeUnit.DAYS);
            arrayBlockingQueue.drainTo(Collections.emptyList());
            arrayBlockingQueue.peek();
            arrayBlockingQueue.poll();
            arrayBlockingQueue.poll(1,TimeUnit.DAYS);
            arrayBlockingQueue.take();
        } catch (InterruptedException e) {


        }
    }
}
