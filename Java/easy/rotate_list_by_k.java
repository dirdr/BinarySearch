import java.util.*;

class Solution {
    public int[] solve(int[] nums, int k) {
        int[] answer = new int[nums.length];
        for (int i = k; i < nums.length; i++) {
            answer[i-k] = nums[i];
        }
        for (int i = 0; i < k; i++) {
            answer[answer.length-k+i] = nums[i];
        }
        return answer;
    }
}
