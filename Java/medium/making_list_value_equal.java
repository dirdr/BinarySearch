import java.util.*;

class Solution {
    public int solve(int[] nums) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            min = nums[i] < min ? nums[i]: min;
            max = nums[i] > max ? nums[i]: max;
        }
        return max-min;   
    }
}
