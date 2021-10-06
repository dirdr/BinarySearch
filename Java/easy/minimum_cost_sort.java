import java.util.*;

class Solution {
    public int solve(int[] nums) {
        int[] helper = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            helper[i] = nums[i];
        }
        Arrays.sort(helper);
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < nums.length; i++) {
            sum1 += Math.abs(nums[i] - helper[nums.length-1-i]);
        }
        for (int i = 0; i < nums.length; i++) {
            sum2 += Math.abs(nums[i] - helper[i]);
        }
        return sum1 < sum2 ? sum1: sum2;
    }
}
