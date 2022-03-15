import java.util.*;

class Solution {
    public int solve(int[] nums, int target) {
        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        int left = 0;
        int right = nums.length-1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum >= target) {
                right--;
            } else {
                max = sum >= max ? sum: max;
                left++;
            }
        } 
        return max;
    }
}
