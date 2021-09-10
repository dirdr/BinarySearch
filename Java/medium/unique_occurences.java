import java.util.*;

class Solution {
    public boolean solve(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }      
        HashSet<Integer> set = new HashSet<>();
        for (int key: map.keySet()) {
            if (!set.contains(map.get(key))) {
                set.add(map.get(key));
            } else {
                return false;
            }
        }
        return true;
    }
}
