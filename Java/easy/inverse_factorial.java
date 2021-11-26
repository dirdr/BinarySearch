import java.util.*;

class Solution {
    public int solve(int a) {
        for (int i = 0; i <= a; i++) {
            int val = helper(i);
            if (val == a) {
                return i;
            } else if (val > a) {
                return -1;
            }
        }
        return -1;
    }

    int helper(int n) {
        if (n < 1) {
            return 1;
        }
        return n*helper(n-1);
    }
}
