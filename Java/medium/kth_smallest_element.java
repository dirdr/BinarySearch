import java.util.*;

class Solution {
    public int solve(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[k];  
    }
}
