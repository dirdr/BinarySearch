import java.util.*;

class Solution {
    public boolean solve(int[] nums) {
        Arrays.sort(nums);
        int l = nums[1]-nums[0];
        for (int i = 1; i < nums.length-1; i++) {
            if (nums[i+1] - nums[i] != l) return false;
        }
        return true;    
    }
}
