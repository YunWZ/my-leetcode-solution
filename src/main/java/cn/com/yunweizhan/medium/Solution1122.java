package cn.com.yunweizhan.medium;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution1122 {
    public static int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
    public static int[] arr2 = {2, 1, 4, 3, 9, 6};

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> result = new LinkedList<>();
        Map<Integer, Integer> elementNum = new HashMap<>();

        //计算arr1中各个元素出现的次数
        for (int item : arr1) {
            if (elementNum.containsKey(item)) {
                elementNum.put(item, elementNum.get(item) + 1);
            } else {
                elementNum.put(item, 1);
            }
        }

        int resultIndex = 0;
        for (int item : arr2) {
            //按照arr2中的顺序输出结果
            for (int i = 0; i < elementNum.get(item); i++) {
                arr1[resultIndex++] = item;
            }
            //从elementNum中删除arr2中的元素,剩下的就是未在 arr2 中出现过的元素
            elementNum.remove(item);
        }
        for (Integer key : elementNum.keySet().stream().sorted().collect(Collectors.toList())) {
            for (int i = 0; i < elementNum.get(key); i++) {
                arr1[resultIndex++] = key;
            }
        }

        return arr1;
    }

}
