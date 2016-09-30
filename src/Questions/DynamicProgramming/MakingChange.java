package Questions.DynamicProgramming;

import java.util.ArrayList;

/**
 * Created by nicholai on 9/29/16.
 *
 * Question : Implement an Algorithm that takes n denominations of coins and makes change in as few coins possible.
 *
 * Answer   : Classic Dynamic Programming programming problem where the program takes n denominations of coins
 *            of values 1 = V_1 < V_2 < V_3 < ... < V_n.
 *
 * Output   : make change using the least amount of coins possible
 *
 */
public class MakingChange {

    /**
     * @param coinDenominations List of all the coin denominations the make change from where 1 = coinDenomination[0] < coinDenomination[1] < ... < coinDenomination[k]
     * @return List of the coin Amounts to change
     */
    public static int[] makeChange(double changeAmount, int[] coinDenominations){
        int[] answer = new int[coinDenominations.length];   // Make our list the size of the input where each value is the number of coins of that denomination to return

        return answer;
    }
}