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
        int patternLength = pattern.length();
        int textLength = text.length();
        int i = 0;
        int j = 0;
        int[][] prefix = KnuthMorrisPrattMatcher.prefix(pattern);
        for (; i < textLength && j < patternLength; i++) {
            j = prefix[text.charAt(i)][j];
        }
        if (j == patternLength) return i - patternLength;
        return textLength;
    }

    public static int[][] prefix(String pattern) {
        int radix = 256;
        int m = pattern.length();
        int[][] prefixFunction = new int[radix][m];
        prefixFunction[pattern.charAt(0)][0] = 1;
        for (int i = 0, j = 1; j < m; j++) {
            for (int inner = 0; inner < radix; inner++)
                prefixFunction[inner][j] = prefixFunction[inner][i];
            prefixFunction[pattern.charAt(j)][j] = j+1;
            i = prefixFunction[pattern.charAt(j)][i];
        }
        return prefixFunction;
    }

    public static void main(String[] args) {
        String pizza = "I want to order a pepperoni pizza.";
        String peppr = "pepperoni";
        System.out.println("There was a match at offset " + KnuthMorrisPrattMatcher.match(pizza, peppr));
        KnuthMorrisPrattMatcher.match(pizza, peppr);
    }
}
