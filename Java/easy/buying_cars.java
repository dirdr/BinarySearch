import java.util.*;

class Solution {
    public int solve(int[] prices, int k) {
        Arrays.sort(prices);
        int count = 0;
        for (int i = 0; i < prices.length; i++) {
            if (k >= prices[i]) {
                count++;
                k-=prices[i];
            };        
        }
        return count;
    }
}
