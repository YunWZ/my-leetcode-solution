package cn.com.yunweizhan.high;

import java.util.function.Function;

public class Solution1095 {
    int count = 0;

    public int findInMountainArray(int target, MountainArray mountainArr) {
        if (mountainArr.length() == 0)
            return -1;
        int mid;
        int lo = 0, hi = mountainArr.length() - 1;
        while (lo < hi) {
            mid = lo + (hi - lo) / 2;
            count += 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1))
                lo = mid + 1;
            else
                hi = mid;
        }

        int res = findInMountainArray(target, mountainArr, 0, lo, i -> i);
        if (res == -1)
            res = findInMountainArray(target, mountainArr, lo + 1, mountainArr.length()-1, i -> -i);
        return res;
    }

    private int findInMountainArray(int target, MountainArray mountainArr, int lo, int hi, Function<Integer, Integer> lambda) {
        target = lambda.apply(target);
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            count++;
            int cur = lambda.apply(mountainArr.get(mid));
            if (cur == target)
                return mid;
            else if (cur < target)
                lo = mid + 1;
            else
                hi = mid - 1;
        }

        return -1;
    }


    public static void main(String[] args) {
        System.out.println(0.6==(0.3+0.3));
    }
}

interface MountainArray {
    int get(int index);

    int length();
}

class MountainArrayImpl implements MountainArray {
    private int[] mountain;

    MountainArrayImpl(int[] mountain) {
        this.mountain = mountain;
    }

    @Override
    public int get(int index) {
        return mountain[index];
    }

    @Override
    public int length() {
        return mountain == null ? 0 : mountain.length;
    }
}