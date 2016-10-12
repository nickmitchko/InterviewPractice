package NumberTheory.Primes;

import NumberTheory.ModularExponentiation;

/**
 * Created  : nicholai on 10/11/16.
 * Author   : Nicholai Mitchko
 * Package  : NumberTheory.Primes
 * Project  : InterviewPractice
 *
 * This file contains algorithm(s) that are almost perfect a predicting if a number is prime.
 * They are computationally cheap compared to exhaustive methods.
 *
 */
public class PseudoPrime {

    public static boolean prime(int n){
        return ModularExponentiation.mod(2, n - 1, n) == 1 % n;
    }

}
