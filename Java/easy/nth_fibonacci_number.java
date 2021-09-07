import java.util.*;

class Solution {
    public int solve(int n) {
        int f = 1;
        int s = 1;
        int n_number = 0;
        if (n < 3) {
            return 1;
        }   
        for (int i = 2; i < n; i++) {
            int temp = f + s;
            n_number = temp;
            f = s;
            s = temp;
        }
        return n_number;       
    }
}
