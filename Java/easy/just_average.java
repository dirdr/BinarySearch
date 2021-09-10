import java.util.*;

class Solution {
    public boolean solve(int[] nums, int k) {

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int x = -k*nums.length+k+sum;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                return true;
            }
        }
        return false;
    }
}
