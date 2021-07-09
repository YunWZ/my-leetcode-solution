package cn.com.yunweizhan.high;

public class Solution4 {
    int[] n1, n2;
    int length1, length2;

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        n1 = nums1;
        n2 = nums2;
        length1 = nums1.length;
        length2 = nums2.length;
        int totalLength = length1 + length2;
        if (totalLength % 2 == 0) {
            return (getKthElement(totalLength / 2) + getKthElement(totalLength / 2 + 1)) / 2.0;
        } else {
            return getKthElement(totalLength / 2 + 1);
        }
    }

    private int getKthElement(int kth) {
        int index1 = 0, index2 = 0;
        while (true) {
            if (index1 == length1) {
                return n2[index2 + kth - 1];
            }

            if (index2 == length2) {
                return n1[index1 + kth - 1];
            }
            if (kth == 1) {
                return Math.min(n1[index1], n2[index2]);
            }


            int half = kth / 2;

            int newIndex1 = Math.min(index1 + half, length1) - 1;
            int newIndex2 = Math.min(index2 + half, length2) - 1;
            if (n1[newIndex1] <= n2[newIndex2]) {
                kth -= (newIndex1 - index1 +1);
                index1 = newIndex1 + 1;
            } else {
                kth -= (newIndex2 - index2 +1);
                index2 = newIndex2 + 1;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2}, nums2 = {3,4};
        Solution4 solution4 = new Solution4();
        System.out.println(solution4.findMedianSortedArrays(nums1, nums2));
    }
}
