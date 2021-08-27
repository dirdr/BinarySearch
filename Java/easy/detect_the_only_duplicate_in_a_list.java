import java.util.*;

class Solution {
    public int solve(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] != nums[i+1]-1) return nums[i];
        }
        return -1;   
    }
}
