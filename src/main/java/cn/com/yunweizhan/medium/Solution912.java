package cn.com.yunweizhan.medium;

public class Solution912 {
    public int[] sortArray(int[] nums) {
        return quickSort(nums, 0, nums.length - 1);
    }

    private int[] quickSort(int[] nums, int lo, int hi) {
        if (lo >= hi) {
            return nums;
        }

        int v = nums[lo];
        int lt = lo, gt = hi;
        int i = lo + 1;
        while (i <= gt) {
            if (nums[i] < v) exch(nums, lt++, i++);
            else if (nums[i] > v) exch(nums, gt--, i);
            else i++;
        }
        quickSort(nums, lo, lt - 1);
        quickSort(nums, gt + 1, hi);
        return nums;
    }

    private void exch(int[] nums, int i, int i1) {
        int temp = nums[i];
        nums[i] = nums[i1];
        nums[i1] = temp;
    }
}
