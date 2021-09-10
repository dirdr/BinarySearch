import java.util.*;

class Solution {
    public int solve(int n) {   
        if (n < 10) return n;
        n = sum(n);
        return solve(n);     
    }

    public int sum(int n) {
        int return_ = 0;
        while (n > 0) {
            return_ += n % 10;
            n = n / 10; 
        }
        return return_;
    }
}
