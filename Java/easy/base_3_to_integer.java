import java.util.*;

class Solution {
    public int solve(String s) {
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            int cur = Character.getNumericValue(s.charAt(i));
            answer += cur * Math.pow(3, s.length()-1-i);
        }
        return answer;
    }
}
