import java.util.*;

class Solution {
    public int[] solve(int[] nums) {


        Arrays.sort(nums);
        int[] answer = new int[nums.length];
        int fi = 0;
        int si = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                answer[i] = nums[nums.length-1-fi];
                fi++;
            } else {
                answer[i] = nums[si];
                si++;
            }
        }
        return answer;
        
    }
}
