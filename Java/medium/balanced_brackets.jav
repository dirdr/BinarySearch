import java.util.*;

class Solution {
    public boolean solve(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count++;
            } 
            if (count == 0) {
                return false;
            }
            if (s.charAt(i) == ')') count--;
        }
        return count == 0;
    }
}
