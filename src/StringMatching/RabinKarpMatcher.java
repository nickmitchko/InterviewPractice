package StringMatching;

/**
 * Created  : nicholai on 10/11/16.
 * Author   : Nicholai Mitchko
 * Package  : StringMatching
 * Project Name : InterviewPractice
 *
 * Desc:    The RabinKarp algorithm takes advantage of modulo math using character codes:
 *          k = len(Match)
 *          t = Baseₙ % q
 *          s = Matchₙ % q
 *          For some q given the character codes for each character in the string.
 *          Assumes t ≡ s
 *
 * Issues:  Algorithm may show spurious matches:
 *          ex: t ≢ Matchₙ % q
 *
 * Resolve Issues:
 *          choose q that is:
 *          - prime
 *          - large enough to exclude spurious matches.
 *
 */
public class RabinKarpMatcher {

    public static int match(String base, String pattern, int radix, int primeQ){
        // Pre-processing
        int patternLength = pattern.length();
        long radixMod = 1;
        for(int i = 1; i <= patternLength-1; ++i){
            radixMod = (radix * radixMod) % primeQ;
        }
        // Find hash
        long patternHash = 0;
        for(int j = 0; j < patternLength; ++j){
            patternHash = (radix * patternHash + pattern.charAt(j)) % primeQ;
        }
        // Do actual searching
        int textLength = base.length();
        if(textLength < patternLength) return -1;
        long textHash = 0;
        // Compute Hashes for text
        for(int j = 0; j < patternLength; ++j){
            textHash = (radix * textHash + base.charAt(j)) % primeQ;
        }
        // index 0 match checking
        if(patternHash == textHash) return 0;
        for(int i = patternLength; i < textLength; ++i){
            textHash = (textHash + primeQ - radixMod*base.charAt(i-patternLength) % primeQ) %primeQ;
            textHash = (textHash * radix + base.charAt(i)) % primeQ;
            // matching
            int off = i - patternLength + 1;
            if(patternHash == textHash){
                return off;
            }
        }
        return -1;
    }
}
