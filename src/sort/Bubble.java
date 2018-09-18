package sort;

import java.util.Arrays;
import java.util.Random;

/**
 * author: xuzhemin
 * 2018/9/18 11:45
 * 冒泡排序
 * 时间复杂度 log(n^2)
 */
public class Bubble {

    public static void main(String[] args){
        int len = 10;
        int[] arr = new int[len];
        for (int i=0;i<len;i++){
            arr[i]=new Random().nextInt(100);
        }
        System.out.println("before:"+Arrays.toString(arr));
        System.out.println("after"+Arrays.toString(sortASC(arr)));
    }

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
