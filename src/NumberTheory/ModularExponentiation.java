package NumberTheory;

/**
 * Created  : nicholai on 10/11/16.
 * Author   : Nicholai Mitchko
 * Package  : NumberTheory
 * Project  : InterviewPractice
 */
public class ModularExponentiation {


    /**
     * Computes the i term for: aⁱ mod n as i is increased from 0 to b
     *
     * @param a base of power to computer
     * @param b number to increment i to
     * @param n number of modulo operation
     * @return value of i
     */
    public static int mod(int a, int b, int n){
        int i = 0;
        int d = 1;
        int k = (int) Math.ceil(Math.log(Math.pow(10, 3)));
        boolean[] binary = ModularExponentiation.toBinary(b, k);
        for(int j = k; j >=0; --j){
            i = 2 * i;
            d = (d * d) % n;
            if(binary[i]){
                ++i;
                d = (d * a) % n;
            }
        }
        return d;
    }

    private static boolean[] toBinary(int number, int length) {
        final boolean[] ret = new boolean[length];
        for (int i = length-1; i >= 0; i--) {
            ret[length - 1 - i] = (1 << i & number) != 0;
        }
        return ret;
    }

}
