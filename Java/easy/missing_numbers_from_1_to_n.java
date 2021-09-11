import java.util.*;

class Solution {
    public int[] solve(int[] nums) {
        int max = 0;
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            max = nums[i] > max ? nums[i]: max;
        }
        for (int i = 1; i <= nums.length; i++) {
            if(!set.contains(i)) list.add(i);
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
