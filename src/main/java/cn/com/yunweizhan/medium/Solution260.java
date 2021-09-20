package cn.com.yunweizhan.medium;

public class Solution260 {
    public int[] singleNumber(int[] nums) {
        /*Set<Integer> numSet = new HashSet();
        int[] res = new int[2];
        for (int num : nums) {
            //如果元素第一次出现,将它加入结果集中
            if (!numSet.contains(num)) {
                numSet.add(num);
            } else {
                numSet.remove(num);
            }
        }
        int i = 0;
        for (Integer integer : numSet) {
            res[i++] = integer;
        }
        return res;*/
        int[] res = new int[2];
        int k = 0;
        search:
        for (int i = 0; i < nums.length - 1; i++) {
            int j = i + 1;
            int v = nums[i];
            for (; j < nums.length; j++) {
                if (v == nums[j]||nums[j]==-1)
                    break;
            }
            if (j == nums.length) {
                res[k++] = v;
                if (k == 2) break search;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 1, 3, 2, 5};
        Solution260 solution260 = new Solution260();
        int[] ints = solution260.singleNumber(a);
        System.out.println(ints);
    }
}
