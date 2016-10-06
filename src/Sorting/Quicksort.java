package Sorting;

/**
 * Created by nicholai on 10/4/16.
 * Worst case running time: θ(n^2)
 * Average case running time: θ(n * log(n))
 *
 * Source: Introduction to Algorithms 3rd Edition: Cormen, Leiserson, Rivest, Stein: Page 171
 *
 */
public class Quicksort {
    
    private int[] arr;
    
    public Quicksort(int[] array){
        this.arr = array;
    }

    public void QuickSort(int p, int r){
        if (p < r) {
            int q = this.Partition(p, r);
            this.QuickSort(p, q - 1);
            this.QuickSort(q + 1, r);
        }
    }

    private int Partition(int p, int r){
        int x = this.arr[r];
        int i = p - 1;
        for(int j = p; j <= r - 1; ++j){
            if(this.arr[j] <= x){
                ++i;
                int temp = this.arr[i];
                this.arr[i] = this.arr[j];
                this.arr[j] = temp;
            }
        }
        int temp = this.arr[i + 1];
        this.arr[i + 1] = this.arr[r];
        this.arr[r] = temp;
        return i + 1;
    }

    public int[] sort(){
        this.QuickSort(1, this.arr.length);
        return this.arr;

    }

}
