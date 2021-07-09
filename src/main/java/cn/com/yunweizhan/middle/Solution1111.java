package cn.com.yunweizhan.middle;

public class Solution1111 {
    public int[] maxDepthAfterSplit(String seq) {
        int[] ans = new int[seq.length()];
        boolean lflag = false;
        boolean rflag = false;
        for (int i = 0; i < seq.length(); i++) {
            if ('(' == seq.charAt(i)) {
                if (!lflag) {
                    ans[i] = 0;
                } else {
                    ans[i] = 1;
                }
                lflag = !lflag;
            } else {
                if (!rflag) {
                    ans[i] = 0;
                } else {
                    ans[i] = 1;
                }
                rflag = !rflag;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String seq = "()(())()";
        Solution1111 solution1111 = new Solution1111();
        int[] ints = solution1111.maxDepthAfterSplit(seq);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}