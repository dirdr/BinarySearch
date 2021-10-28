import java.util.*;

class Solution {
    public int solve(int[] nums) {
        int count = 0;
        if (nums.length < 2) return nums.length;
        for (int i = 0; i < nums.length; i++) {
            int j = Arrays.binarySearch(nums, nums[i]);
            if (i == j) count++;
        }
        return count;
    }

    
}
