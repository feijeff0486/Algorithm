package com.jeff.algorithm.core;

public class Sort {
    /**
     * 选择排序
     *
     * 从第一个元素开始，依次在未排序的元素中找到最小的并与i位置的元素交换
     *
     * @param array
     */
    public static void selectSort(Comparable[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (Utils.less(array[j], array[minIndex])) {
                    minIndex = j;
                }
                Utils.exch(array, i, minIndex);
            }
        }
    }

    /**
     * 插入排序
     *
     * @param array
     */
    public static void insertSort(Comparable[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0 && Utils.less(array[j], array[j - 1]); j--) {
                Utils.exch(array, j, j - 1);
            }
        }
    }

    public static void quickSort(Comparable[] array) {

    }

}
