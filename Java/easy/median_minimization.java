import java.util.*;

class Solution {
    public int solve(int[] nums) {
        Arrays.sort(nums);
        int f = nums[nums.length/2];
        int s = nums[nums.length/2-1];
        return Math.abs(f-s);
    }
}
