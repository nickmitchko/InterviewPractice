package PloynomialsAndFFT;

/**
 * Created by nicholai on 10/7/16.
 *
 * Takes advantage of the divide and conquer method, where the FFT split the DFT into optimal sub-problems.
 *
 */
public class FFT {

    public static void FFT(int[] a){
        for(int s = 1; s <= Math.log(a.length); ++s){
            int m = (int) Math.pow(2, s);
        }
    }

    private static int[] bitReverse(int[] a){
        int[] reverse = new int[a.length];
        for(int k = 0; k < a.length; ++k){
            reverse[java.lang.Integer.reverse(k)] = a[k];
        }
        return reverse;
    }

}
