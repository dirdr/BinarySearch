import java.util.*;

class Solution {
    public int solve(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0));
            max = nums[i] > max ? nums[i]: max;
        }
        for (int i = 1; i <= max+1; i++) {
            if (!map.containsKey(i)) return i;
        }
        return 0;
    }
}
