package Sorting.LinearTimeSorting;

import java.util.Arrays;

/**
 * Created by nicholai on 10/4/16.
 *
 * Sort: Bucket Sort
 *
 * Source: Introduction to Algorithms 3rd Edition: Cormen, Leiserson, Rivest, Stein: Page 200
 *
 * Assumes the input is drawn from a uniform distribution
 *
 */
public class BucketSort {

    private int[] arr;

    public BucketSort(int[] array){
        this.arr = array;
    }

    private void BucketSort(){
        int[] Bucket = new int[this.arr.length];
        Arrays.fill(Bucket, 0);
        for(int i = 1; i < this.arr.length; ++i){
            Bucket[(int)Math.floor(this.arr[i] * this.arr.length)] = this.arr[i];
        }
        for(int i = 0; i < this.arr.length -1; ++i){
            Arrays.sort(Bucket);
        }
        this.arr = Bucket;
    }

    public int[] sort(){
        this.BucketSort();
        return this.arr;
    }
}
