import java.util.*;

class Solution {
    public int solve(int[] nums) {
        int count = 0; 
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j]) count++;
            }
        }
        return count;   
    }
}
