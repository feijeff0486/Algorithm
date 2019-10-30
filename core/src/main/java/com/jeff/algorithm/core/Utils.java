package com.jeff.algorithm.core;

/**
 * @author Jeff
 * @describe
 * @date 2019/10/30.
 */
public final class Utils {
    /**
     * 在数组中交换位置i和j的元素
     * @param array
     * @param i
     * @param j
     */
    public static void exch(Comparable[] array,int i,int j) {
        Comparable item=array[i];
        array[i]=array[j];
        array[j]=item;
    }

    /**
     * 比较a是否比b小
     * @param a
     * @param b
     * @return
     */
    public static boolean less(Comparable a,Comparable b){
        return a.compareTo(b)<0;
    }

    /**
     * 数组是否已排序
     * @param array
     * @return true 已排序,false 未排序
     */
    public static boolean isSorted(Comparable[] array){
        for (int i = 1; i <array.length ; i++) {
            if (less(array[i],array[i-1])){
                return false;
            }
        }
        return true;
    }
}
