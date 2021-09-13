import java.util.*;

class Solution {
    public int[] solve(int[] nums) {
        if (nums.length < 2) return new int[] {};
        ArrayList<Integer> list = new ArrayList<>();
        if (nums[0] > nums[1]) list.add(0);
         boolean a = false;
        for (int i = 1; i < nums.length-1; i++) {
            int curr = nums[i];
            int aft = nums[i+1];
            int previous = nums[i-1];
            if (previous < curr && curr > aft) {
                list.add(i);
            }
        }
         if (nums[nums.length-1] > nums[nums.length-2]) list.add(nums.length-1);
        int len = list.size();
        int[] answer = new int[len];
        for (int i = 0; i < len; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
