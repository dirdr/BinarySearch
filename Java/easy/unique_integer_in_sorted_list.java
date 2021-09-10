import java.util.*;

class Solution {
    public int solve(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num: nums) {
            set.add(num);
        }
        return set.size();
    }
}
