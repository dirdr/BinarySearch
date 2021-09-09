import java.util.*;

class Solution {
    public int solve(int[] nums) {
        Arrays.sort(nums);
        int answer = nums[0]*nums[1] > nums[nums.length-1]*nums[nums.length-2] ? nums[0]*nums[1]: nums[nums.length-1]*nums[nums.length-2];
        return answer;   
    }
}
