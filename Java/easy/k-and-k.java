import java.util.*;

class Solution {
    public int solve(int[] nums) {
        int max = -1;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            if (set.contains(-nums[i])) {
                max = Math.abs(nums[i]) > max ? Math.abs(nums[i]): max;
            }
        }
        return max;
    }
}
