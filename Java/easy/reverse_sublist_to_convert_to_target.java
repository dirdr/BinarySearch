import java.util.*;

class Solution {
    public boolean solve(int[] nums, int[] target) {
        if (nums.length != target.length) return false;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        for (int i = 0; i < target.length; i++) {
            if (map.get(target[i]) != null) {
                map.put(target[i], map.get(target[i])-1);
            }
            else {
               return false;
            }
        }
        for (int key: map.keySet()) {
            if (map.get(key) != 0) return false;
        }
        return true;  
    }
}
