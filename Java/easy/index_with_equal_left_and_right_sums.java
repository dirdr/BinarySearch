import java.util.*;

class Solution {
    public int solve(int[] nums) {
        if (nums.length == 0 || nums.length == 1) return 0;
        int sufs = 0;
        int pres = 0;
        for (int i = 1; i < nums.length; i++) {
            sufs += nums[i];
        }
        if (pres == sufs) return 0;
        for (int i = 1; i < nums.length; i++) {
            pres += nums[i-1];
            sufs -= nums[i];
            if (pres == sufs) return i;
        }
        return -1;
    }
}
