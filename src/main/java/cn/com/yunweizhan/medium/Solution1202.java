package cn.com.yunweizhan.medium;

import java.util.LinkedList;
import java.util.List;

public class Solution1202 {
    private int[] id;
    private List<Character>[] chars;
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        id = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            id[i] = i;
        }
        chars = new List[s.length()];
/*        pairs.forEach(item->{
            id[item.get(0)]!=id[item.get()]
        });*/
        return "";
    }

    public static void main(String[] args) {
        Solution1202 solution1202 = new Solution1202();
        String s = "dcab";
        List<List<Integer>> pairs = new LinkedList<>();
        pairs.add(getPair(0, 3));
        pairs.add(getPair(1, 2));
        pairs.add(getPair(0, 2));
        System.out.println(solution1202.smallestStringWithSwaps(s, pairs));
    }

    private static List<Integer> getPair(int i, int j) {
        List<Integer> l3 = new LinkedList<>();
        l3.add(j);
        l3.add(i);
        return l3;
    }
}
