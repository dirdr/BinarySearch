import java.util.*;

class Solution {
    public String[] solve(int n) {

        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            int current = i+1;
            String s = String.valueOf(current);
            boolean flag = false;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '3' || s.charAt(j) == '6' || s.charAt(j) == '9') {
                    answer[i] = "clap";
                    flag = true;
                } 
            }
            if (!flag) {
                if (current % 3 == 0) {
                answer[i] = "clap";
                } else {
                    answer[i] = s;
                }
            }
        }
        return answer;
    }
}
