import java.util.*;

class Solution {
    public boolean solve(int[] nums, int k) {
        int l = 0;
        int r = nums.length-1;
        Arrays.sort(nums);
        while (l < nums.length && r > 0) {
            int l_value = nums[l];
            int r_value = nums[r];
            if ((l_value + r_value) > k) {
                r--;
            } else {
                if (r_value + l_value == k && r != l) {
                    return true;
                }
                l++;
            }
            
        }
        return false;   
    }
}
