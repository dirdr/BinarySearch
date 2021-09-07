import java.util.*;

class Solution {
    public int solve(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        int max = 0;
        for (int num: map.keySet()) {
            int value = map.get(num);
            max = value > max ? value: max;
        }
        return max;
    }
}
