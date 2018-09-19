package sort;

import java.util.Arrays;
import java.util.Random;

/**
 * author: xuzhemin
 * 2018/9/19 10:09
 */
public class SortTest {


    public static void main(String[] args){
        int len = 1000000;
        int[] arr = new int[len];
        for (int i=0;i<len;i++){
            arr[i]=new Random().nextInt(1000);
        }
        //arr = new int[]{10,5,3,12,14,4};
        //System.out.println("before:"+Arrays.toString(arr));
        long start = System.currentTimeMillis();
        Bubble.sortASC(Arrays.copyOf(arr,arr.length));
        System.out.println("cost="+(System.currentTimeMillis()-start));
        //System.out.println("cost="+(System.currentTimeMillis()-start)+"after bubble sort:"+Arrays.toString(Bubble.sortASC(Arrays.copyOf(arr,arr.length))));
        start = System.currentTimeMillis();
        Quick.sortASC(Arrays.copyOf(arr,arr.length));
        System.out.println("cost="+(System.currentTimeMillis()-start));
        //System.out.println("cost="+(System.currentTimeMillis()-start)+"after quick  sort:"+Arrays.toString(Quick.sortASC(Arrays.copyOf(arr,arr.length))));
    }

}
