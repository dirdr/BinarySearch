import java.util.*;

class Solution {
    public int solve(int[] nums) {
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) set.add(nums[i]);
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i]+1)) count++;
        }
        return count;
    }
}
