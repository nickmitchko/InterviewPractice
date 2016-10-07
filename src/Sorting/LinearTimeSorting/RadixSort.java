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
        int i, m = this.arr[0], exp = 1, n = this.arr.length;
        int[] b = new int[10];
        for (i = 1; i < n; i++)
            if (this.arr[i] > m)
                m = this.arr[i];
        while (m / exp > 0)
        {
            int[] bucket = new int[10];

            for (i = 0; i < n; i++)
                bucket[(this.arr[i] / exp) % 10]++;
            for (i = 1; i < 10; i++)
                bucket[i] += bucket[i - 1];
            for (i = n - 1; i >= 0; i--)
                b[--bucket[(this.arr[i] / exp) % 10]] = this.arr[i];
            for (i = 0; i < n; i++)
                this.arr[i] = b[i];
            exp *= 10;
        }
        return this.arr;
    }

    public int[] sort(){
        return this.RadixSort();
    }
}
