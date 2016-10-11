package StringMatching;

/**
 * Created  : nicholai on 10/11/16.
 * Author   : Nicholai Mitchko
 * Package  : StringMatching
 * Project Name : InterviewPractice
 * <p>
 * The Knuth, Morris, Pratt string matching algorithm uses a transition function
 * to compute which shifts in the matching offset are invalid. Given this information
 * we can then match a string in significantly less time that similar automata based
 * matching algorithms. e.g. Given pattern |A|B|A|B|C| we know that an offset shift of
 * 2 from the first match will also be valid. Extrapolating on this, we store a table
 * of equivalent offsets relative to the pattern to exclude known pattern fails.
 * <p>
 * ex:  i  1 2 3 4 5 6 7
 * P[i]    a b a b a c a
 * π[i]    0 0 1 2 3 0 1
 */
public class KnuthMorrisPrattMatcher {

    public static int match(String text, String pattern) {
        int   n  = text.length();
        int   m  = pattern.length();
        int[] pi = KnuthMorrisPrattMatcher.prefix(pattern);
        int   q  = 0;
        for(int i = 0; i < n; ++i){
            while(q > 0 && pattern.charAt(q+1) != text.charAt(i)){
                q = pi[q];
            }
            if(pattern.charAt(q+1) == text.charAt(i)){
                ++q;
            }
            if(q==m){
                return i-m;
            }
        }
        return -1;
    }

    // Prefix function O(m)
    public static int[] prefix(String pattern) {
        int   m  = pattern.length();
        int[] pi = new int[m];
        pi[0] = 0;
        int k = 0;
        for (int q = 1; q < m; ++q) {
            while (k > 0 && pattern.charAt(k + 1) != pattern.charAt(q)) {
                k = pi[k];
            }
            if (pattern.charAt(k + 1) == pattern.charAt(q)) {
                ++k;
            }
            pi[q] = k;
        }
        return pi;
    }

    public static void main(String[] args){
        String pizza = "I want to order a pepperoni pizza.";
        String peppr = "pepperoni";
        System.out.println("There was a match at offset "+  KnuthMorrisPrattMatcher.match(pizza, peppr));
        KnuthMorrisPrattMatcher.match(pizza ,peppr);
    }
}
