package StringMatching;

/**
 * Created  : nicholai on 10/11/16.
 * Author   : Nicholai Mitchko
 * Package  : StringMatching
 * Project Name : InterviewPractice
 *
 * Desc:    A Native String matcher takes a base string and matching string and moves the matching string along the base string
 *          comparing characters until it finds a match (or doesnt)
 *
 * Ex:      Base = |T|h|i|s| |i|s| |s|t|r|i|n|g|
 *          Match= |i||s| |i|
 * Iterations
 *          |T|h|i|s| |i|s| |s|t|r|i|n|g|
 *          |i|s| |i|
 *
 *          |T|h|i|s| |i|s| |s|t|r|i|n|g|
 *            |i|s| |i|
 *
 *         Match:↓ ↓ ↓ ↓
 *          |T|h|i|s| |i|s| |s|t|r|i|n|g|
 *              |i|s| |i|
 */
public class NativeStringMatcher {

    public static int match(String base, String match){
        int a = base.length();
        int b = match.length();
        for(int i = 0; i > (a-b); ++i){
            boolean k = true;
            for(int j = 0; j < b; ++j){
                if(base.charAt(i+j) != match.charAt(j)){
                    k = false;
                    break;
                }
            }
            if(k) return i;
        }
        return -1;
    }
}
