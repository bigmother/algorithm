package org.xzm.sort;

/**
 * author: xuzhemin
 * 2018/9/18 11:45
 * 冒泡排序
 * 时间复杂度 O(n^2)
 */
public class Bubble {

    public static int[] sortASC(int[] arr){
        int len = arr.length;
        for (int i=0;i<len;i++){
            for (int j=i;j<len;j++){
                //比较大小，如果前面的比后面的大，交换位置。循环结束后从i后面的最大的数会被交换至最后面。
                if (arr[i]>arr[j]){
                    int tmp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
        return arr;
    }
}
