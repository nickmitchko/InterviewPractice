package Sorting.Elementary;

/**
 * Created  : nicholai on 10/10/16.
 * Author   : Nicholai Mitchko
 * Package  : Sorting.Elementary
 * Project Name : InterviewPractice
 */
public class Selectionsort {

    public static Comparable[] sort(Comparable[] a){
        for(int i = 0; i < a.length; ++i){
            int min = i;
            for(int j = i+1; j < a.length; ++j){
                if(Sorting.SortingUtilities.less(a[j], a[min])){
                    min = j;
                }
                Sorting.SortingUtilities.exch(a, i, min);
            }
        }
        return a;
    }
}