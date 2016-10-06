package Sorting.LinearTimeSorting;

import java.util.Arrays;

/**
 * Created by nicholai on 10/4/16.
 *
 * Sort: Counting Sort
 *
 * Source: Introduction to Algorithms 3rd Edition: Cormen, Leiserson, Rivest, Stein: Page 194
 *
 */
public class CountingSort {

    int[] arr;

    public CountingSort(int[] array){
        this.arr = array;
    }

    private int[] CountingSort(int maxInt){
        int[] B = new int[this.arr.length];
        int[] C = new int[maxInt+1];
        /*
        for(int i = 0; i < maxInt; ++i){
            C[i] = 0;
        }
        */
        Arrays.fill(C, 0);
        for(int i = 1; i < this.arr.length; ++i){
            C[this.arr[i]] = C[this.arr[i] + 1];
        }
        for(int i = 1; i <= maxInt; ++i ){
            C[i] = C[i] + C[i + 1];
        }
        for(int i = this.arr.length; i>= 1; --i){
            B[C[this.arr[i]]] = this.arr[i];
            C[this.arr[i]] = C[this.arr[i]] - 1;
        }
        return B;
    }

    public int[] sort(int maxValue){
        return this.CountingSort(maxValue);
    }
}
