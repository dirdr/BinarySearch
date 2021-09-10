import java.util.*;

class Solution {
    public int[] solve(int[][] intervals) {
        int left = Integer.MIN_VALUE;
        int right = Integer.MAX_VALUE;   

        for (int[] val: intervals) {
            left = Math.max(val[0], left);
            right = Math.min(val[1], right);
        }    
        return left <= right ? new int[] {left, right}: new int[] {};
    }
}
