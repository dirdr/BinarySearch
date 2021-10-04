import java.util.*;

class Solution {
    public boolean solve(int[] nums) {
        boolean xor = true;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] > nums[i+1]) {
                System.out.println("first");
                xor = false;
                break;
            }
        }
        if (!xor) {
            for (int i = 0; i < nums.length-1; i++) {
                if (nums[i] < nums[i+1]) {
                    System.out.println("Second");
                    return false;
                }
            }
        }
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]) {
                return false;
            }
        }
        return true;
    }
}
