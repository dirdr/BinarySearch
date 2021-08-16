import java.util.*;

class Solution {
    public boolean solve(int[] nums) {
        int count = 0;
        for (int number : nums) {
            if (number == 1) {
                count++;
            }
        }
        int verifie = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                verifie++;
                if (i == nums.length - 1) {
                    if (verifie == count)
                        return true;
                }
            } else {
                if (verifie == count) {
                    return true;
                }
                verifie = 0;
            }
        }
        return false;
    }
}
