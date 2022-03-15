import java.util.*;

class Solution {
    public int solve(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;
        int performed = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                nums[i] = -nums[i];
                performed++;
            }
            if (performed == k) break;
        }
        Arrays.sort(nums);
        while (performed < k) {
            if (nums[0] != 0) {
                nums[0] = -nums[0];
            }
            performed++;
        }
        for (int num: nums) sum += num;
        return sum;  
    }
}
