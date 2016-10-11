package Sorting;

/**
 * Created  : nicholai on 10/10/16.
 * Author   : Nicholai Mitchko
 * Package  : Sorting
 * Project Name : InterviewPractice
 */
public class SortingUtilities {

    public static boolean less(Comparable a, Comparable b){
        return a.compareTo(b) < 0;
    }

    public static void exch(Comparable[] a, int i, int j){
        Comparable T = a[i]; a[i] = a[j]; a[j] = T;
    }

    public static boolean isSorted(Comparable[] arr){
        for(int i = 0; i < arr.length; ++i){
            if(less(arr[i], arr[i-1])){return false;}
        }
        return true;
    }

}
