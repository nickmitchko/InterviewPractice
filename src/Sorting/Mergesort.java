package Sorting;

/**
 * Created  : nicholai on 10/11/16.
 * Author   : Nicholai Mitchko
 * Package  : Sorting
 * Project Name : InterviewPractice
 */
public class Mergesort {

    private static Comparable[] aux;

    public static void topDownSort(Comparable[] arr){
        aux = new Comparable[arr.length];
        sort(arr, 0, arr.length-1);
    }

    public static void iterativeBottomUpSort(Comparable[] arr){
        aux = new Comparable[arr.length];
        for(int subsize = 1; subsize < arr.length; subsize *= 2){
            for(int low = 0; low < arr.length - subsize; low += subsize + subsize){
                merge(arr, low, low+subsize-1, Math.min(low+subsize+subsize-1, arr.length-1));
            }
        }
    }

    public static void sort(Comparable[] arr, int low, int high){
        if(high <= low) return;
        int middle = low + (high - low)/2;
        sort(arr, low, middle);
        sort(arr, middle, high);
        merge(arr, low, middle, high);
    }

    private static void merge(Comparable[] arr, int low, int middle, int high){
        int i = low;
        int j = middle + 1;
        for(int k = low; k <= high; ++k){
            aux[k] = arr[k];
        }
        for(int k = low; k <= high; ++k){
            if(i > middle) arr[k] = aux[j++];
            else if(j > high) arr[j] = aux[i++];
            else if(SortingUtilities.less(aux[j], aux[i])) arr[k] = aux[j++];
            else arr[k] = aux[i++];
        }
    }

}
