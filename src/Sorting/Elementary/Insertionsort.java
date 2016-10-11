package Sorting.Elementary;

/**
 * Created  : nicholai on 10/10/16.
 * Author   : Nicholai Mitchko
 * Package  : Sorting.Elementary
 * Project Name : InterviewPractice
 */
public class Insertionsort {

    public static void sort(Comparable[] arr){
        for(int i = 1; i < arr.length; ++i){
            for(int j = i; j > 0 && Sorting.SortingUtilities.less(arr[j], arr[j-1]); --j){
                Comparable temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
            }
        }
    }
}
