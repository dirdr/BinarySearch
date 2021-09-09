import java.util.*;

class Solution {
    public int[] solve(int[] nums) {
        int min_sf = Integer.MAX_VALUE;
        int[] answer = new int[nums.length];
        answer[0] = 0;
        int index = 1;
        for (int i = 0; i < nums.length-1; i++) {
            min_sf = nums[i] < min_sf? nums[i]: min_sf;
            answer[i+1] = min_sf;
        }
        return answer;
    }
}
