package Sorting.LinearTimeSorting;

/**
 * Created by nicholai on 10/4/16.
 *
 * Sort: Radix Sort
 *
 * Source: Introduction to Algorithms 3rd Edition: Cormen, Leiserson, Rivest, Stein: Page 197
 *
 * Info: Card sorting algorithm (sort by each digit)
 *
 */
public class RadixSort {

    private int[] arr;

    public RadixSort(int[] array){
        this.arr = array;
    }

    private int[] RadixSort(){
        int maxLength = 0;
        for(int i = 0; i < this.arr.length; ++i){
            if((int)(Math.log10(this.arr[i])+1) > maxLength){
                maxLength = (int)(Math.log10(this.arr[i])+1);
            }
        }
        for(; maxLength >= 1; --maxLength){

        }
        return this.arr;
    }

    public int[] sort(){
        return this.RadixSort();
    }
}
