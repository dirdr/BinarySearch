import java.util.*;

class Solution {
    public int solve(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0];
        int num = 0;
        for (int i = 1; i < nums.length; i++) {
            num += nums[i] - min;
        }
        return num;
    }
}
