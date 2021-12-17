import java.util.*;

class Solution {
    public int solve(int[] prices) {
        if (prices.length < 2) return 0;
        int profit = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if ((prices[i] - min) > profit) {
                profit = prices[i]-min;
            } 
            if (prices[i] < min) {
                min = prices[i];
            }
        }
        return profit;
    }
}
