import java.util.*;

class Solution {
    public int solve(int num) {
        int sum = 0;
        String s = String.valueOf(num);
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            int n = Character.getNumericValue(curr);
            sum+=n;
        }
        return sum;
    }
}
