package Sorting;

/**
 * Created by nicholai on 10/4/16.
 * Running Time: θ(n * log(n))
 *
 * Source: Introduction to Algorithms 3rd Edition: Cormen, Leiserson, Rivest, Stein: Page 151-158
 *
 */
public class Heapsort {

    private int[] arr;

    public Heapsort(int[] array){
        this.arr = array;
    }

    private void Heapsort(){
        this.buildMaxHeap();
        for(int i = this.arr.length; i >= 2; --i){
            this.exchange(1, i);
        }
    }

    private void maxHeapify(int i){

    }

    private void buildMaxHeap(){
        int heapSize = this.arr.length;
        for(int i = (int)Math.floor(heapSize / 2); i >= 1; --i){
            this.maxHeapify(i);
        }
    }

    private void exchange(int index, int index1){
        int temp = this.arr[index];
        this.arr[index] = this.arr[index1];
        this.arr[index1] = temp;
    }

    public int[] sort(){
        this.Heapsort();
        return this.arr;
    }

}
