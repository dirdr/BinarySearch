import java.util.*;

class Solution {
    public int solve(int[] nums) {
        int answer = 0;
        int[] sorted = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sorted[i] = nums[i];
        }
        Arrays.sort(sorted);
        for (int i = 0; i < nums.length; i++) {
            if (sorted[i] == nums[i]) answer++;
        }
        return answer;      
    }
}
