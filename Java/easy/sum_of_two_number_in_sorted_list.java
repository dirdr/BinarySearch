import java.util.*;

class Solution {
    public boolean solve(int[] nums, int k) {
        int l = 0;
        int r = nums.length-1;
        while (l < r) {
            if (nums[l] + nums[r] == k) return true;
            else if (nums[l] + nums[r] > k) {
                r--;
            } else {
                l++;
            }
        }
        return false;
    }
}
