import java.util.*;

class Solution {
    public String solve(String s) {
        char previous = s.charAt(0);
        int count = 0;
        String answer = "";
        for (int i = 1; i < s.length(); i++) {
            if (previous == s.charAt(i)) count++;
            else {
                answer+=String.valueOf(++count)+previous;
                count = 0;
            }
            previous = s.charAt(i);
        }
        answer+=String.valueOf(++count)+previous;
        return answer;
        
    }
}
