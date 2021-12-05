import java.util.*;

class Solution {
    public boolean solve(int[] nums) {
        if (nums.length < 2) return true;
        for (int i = 0; i < nums.length; i++) {
            int b1 = 2*i+1;
            int b2 = 2*i+2;
            if (b2 < nums.length) {
                if (nums[i] < nums[b2]) {
                    return false;
                }
            } 
            if (b1 < nums.length) {
                if (nums[i] < nums[b1]) {
                    return false;
                }
            }
        }
        return true;   
    }
}
