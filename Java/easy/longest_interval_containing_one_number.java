import java.util.*;

class Solution {
    public int solve(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int max_range = 0;
            int min_range = 0;
            int num = nums[i];
            if (i != 0) {
                min_range = nums[i-1]+1;
            } else {
                min_range = 0;
            }
            if (i < nums.length-1) {
                max_range = nums[i+1]-1;
            } else {
                max_range = 100000;
            }
            if (min_range == 0) {
                max = max_range;
            } else {
                max = max_range-(min_range-1) > max ? max_range-(min_range-1): max;
            }
        }
        return max;
    }
}
