package NumberTheory;

/**
 * Created by nicholai on 10/11/16.
 *
 * Euclid's Algorithm is an ancient algorithm that returns 2 integer's Greatest Common Divisor
 *
 * Euclid's Extended is an extension of the algorithm that returns additional important information
 * with little added cost to the algorithm's run time.
 *
 */
public class EuclidsAlgorithm {

    public static int GCD(int a, int b) {
        if (b == 0){
            return a;
        }
        return EuclidsAlgorithm.GCD(b, a % b);
    }

    public static int[] GCDExtended(int a, int b){
        if(b == 0){
            return new int[]{a, 1, 0};
        }
        int[] info = EuclidsAlgorithm.GCDExtended(b, a % b);
        return new int[]{info[0], info[2], info[1] - (int) Math.floor(a/b) * info[2]};
    }

    public static int iterativeGCD(int a, int b){
        return -1;
    }

}
