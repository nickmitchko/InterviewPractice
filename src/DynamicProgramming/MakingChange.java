package DynamicProgramming;

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
    public static int makeChange(int changeAmount, int[] coinDenominations){
        int[][] solution = new int[coinDenominations.length+1][changeAmount+1];
        for(int i =0; i <= coinDenominations.length; ++i){
            solution[i][0] = 1;
        }
        for(int i =1; i <= changeAmount; ++i){
            solution[0][i] = 0;
        }
        for(int i = 1; i <= coinDenominations.length; ++i){
            for(int j = 1; j <= changeAmount; ++j){
                if(coinDenominations[i-1] <= j){
                    solution[i][j] = solution[i-1][j] + solution[i][j - coinDenominations[i-1]];
                } else {
                    solution[i][j] = solution[i-1][j];
                }
            }
        }
        return solution[coinDenominations.length][changeAmount];
    }
}