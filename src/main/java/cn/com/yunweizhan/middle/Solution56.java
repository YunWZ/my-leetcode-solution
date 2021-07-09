package cn.com.yunweizhan.middle;

import java.util.*;

public class Solution56 {
    class Node {
        int l, r;

        public Node(int l, int r) {
            this.l = l;
            this.r = r;
        }

        @Override
        public String toString() {
            return "[" + l + "," + r + "]";
        }
    }

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));
        List<Node> res = new LinkedList<>();
        for (int i = 0; i < intervals.length;) {
            int maxR = intervals[i][1];
            int j = i + 1;
            for (; j < intervals.length; j++) {
                if (intervals[j][0] > maxR) {
                    break;
                }
                maxR = Math.max(maxR,intervals[j ][1]);
            }
            res.add(new Node(intervals[i][0], maxR));
            i = j;
        }

        int[][] result = new int[res.size()][2];
        int i = 0;
        for (Node re : res) {
            result[i][0] = re.l;
            result[i][1] = re.r;
            i++;
        }

        return result;
    }

    public static void main(String[] args) {
        Solution56 solution56 = new Solution56();
        int[][] intervals =
                {{2,3},{4,5},{6,7},{8,9},{1,10}};
        int[][] merge = solution56.merge(intervals);
        for (int i = 0; i < merge.length; i++) {
            System.out.printf("[%d,%d]\t", merge[i][0], merge[i][1]);
        }
    }
}
