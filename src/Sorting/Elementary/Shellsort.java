package Sorting.Elementary;

import Sorting.SortingUtilities;

/**
 * Created  : nicholai on 10/11/16.
 * Author   : Nicholai Mitchko
 * Package  : Sorting.Elementary
 * Project Name : InterviewPractice
 */
public class Shellsort {

    public static void sort(Comparable[] arr){
        int n = 1;
        while(n < arr.length){
            n = 3*n + 1;
        }
        while(n >=1){
            for(int i = n; i < arr.length; ++i){
                for(int j = i; j >= n && SortingUtilities.less(arr[j], arr[j-n]); j-=n){
                    SortingUtilities.exch(arr, j, j-n);
                }
            }
            n = n/3;
        }
    }
}
