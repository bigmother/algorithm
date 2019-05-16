package org.xzm.sort;

/**
 * author: xuzhemin
 * 2018/9/18 14:11
 * 快速排序
 * 时间复杂度O(n*log(n))
 */
public class Quick {

    public static int[] sortASC(int[] arr,int... lh){
        int low = 0;
        int high = arr.length-1;

        if (lh.length==2){
            low = lh[0];
            high = lh[1];
        }
        int len = high-low+1;
        if(len<=1){
            //长度0或1，不需要排序
            return arr;
        }
        if(len==2){
            //长度2，直接比较
            if (arr[low]<arr[high]){
                return arr;
            }
            swap(arr,low,high);
            return arr;
        }

        int mid = arr[low];
        int midIndex = low;
        int left=low;
        int right=high;
        while (left<right){
            //从右边找比中值小的
            for (right=high;right>midIndex;right--){
                if (arr[right]<mid){
                    swap(arr,right,midIndex);
                    midIndex=right;
                    break;
                }
            }
            //从左边找比中值大的
            for (left=low;left<midIndex;left++){
                if (arr[left]>mid){
                    swap(arr,left,midIndex);
                    midIndex = left;
                    break;
                }
            }
        }
        sortASC(arr,low,midIndex-1);
        sortASC(arr,midIndex+1,high);
        return arr;
    }

    private static int[] swap(int[] arr,int s,int t){
        int tmp = arr[s];
        arr[s] = arr[t];
        arr[t] = tmp;
        return arr;
    }
}
