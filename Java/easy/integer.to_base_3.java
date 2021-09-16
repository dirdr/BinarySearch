import java.util.*;

class Solution {
    public String solve(int n) {
        if (n == 0) return "0";
       StringBuilder answer = new StringBuilder();
       while (n > 0) {
           int rem = n%3;
           answer.append(rem);
           n = n / 3;
       }
       return answer.reverse().toString(); 
    }
}
