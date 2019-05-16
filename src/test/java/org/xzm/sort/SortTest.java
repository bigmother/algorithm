package org.xzm.sort;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

/**
 * author: xuzhemin
 * 2018/9/19 10:09
 */
public class SortTest {

    @Test
    public void bubbleTest(){
        int len = 100000;
        int[] arr = new int[len];
        for (int i=0;i<len;i++){
            arr[i]=new Random().nextInt(1000);
        }
        long start = System.currentTimeMillis();
        Bubble.sortASC(arr);
        System.out.println("bubble sort arr length="+len+",cost="+(System.currentTimeMillis()-start));
    }

    @Test
    public void quickTest(){
        int len = 100000;
        int[] arr = new int[len];
        for (int i=0;i<len;i++){
            arr[i]=new Random().nextInt(1000);
        }
        long start = System.currentTimeMillis();
        Quick.sortASC(arr);
        System.out.println("quick sort arr length="+len+",cost="+(System.currentTimeMillis()-start));
    }

}
