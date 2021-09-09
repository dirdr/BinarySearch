import java.util.*;

class Solution {
    public int solve(String s) {
        if (s.length() < 1) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        char curr = s.charAt(0);
        int max = 0;
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            System.out.println(s.charAt(i));
            if (s.charAt(i) == curr) count++;
            else {
                count = 1;
                curr = s.charAt(i);
            }
            max = count > max ? count: max;
        }
        return max;
    }
}
