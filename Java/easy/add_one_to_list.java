import java.util.*;

class Solution {
    public int[] solve(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int num = nums[nums.length-1-i];
            if (num == 9) {
                if (i == nums.length-1) {
                    int[] answer = new int[nums.length+1];
                    answer[nums.length-1] = 0;
                    answer[0] = 1;
                    for (int j = 1; j < answer.length-1; j++) {
                        answer[j] = nums[j];
                    }
                    return answer;
                } else {
                    nums[nums.length-1-i] = 0;
                }
            } else {
                nums[nums.length-1-i]++;
                break;
            }
        }
        return nums;
    }
}
