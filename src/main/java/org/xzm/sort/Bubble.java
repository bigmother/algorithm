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
