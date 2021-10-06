import java.util.*;

class Solution {
    public int solve(int[] nums) {
        if (nums.length < 2) return 0;
        int count = 0;
        boolean ascending = nums[0] < nums[1];
        boolean cant = false;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]) cant=true;
            if (ascending) {
                if (nums[i] > nums[i+1]) {
                    if (!cant) count++;
                    ascending = false;
                    cant = false;
                }
            } else {
                if (nums[i] < nums[i+1]) {
                    if (!cant) count++;
                    ascending = true;
                    cant = false;
                }
            } 
        }
        return count;  
    }
}
