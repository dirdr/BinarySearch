import java.util.*;

class Solution {
    public int solve(String s0, String s1) {

        if (s0.length() == 0 || s1.length() == 0) {
            return 0;
        }
        s0 = s0.toLowerCase();
        s1 = s1.toLowerCase();
        String[] splited0 = s0.split(" ");
        String[] splited1 = s1.split(" ");
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < splited0.length; i++) {
            set.add(splited0[i]);
        }
        int answer = 0;
        for (int i = 0; i < splited1.length; i++) {
            if (set.contains(splited1[i])) {
                answer++;
                set.remove(splited1[i]);
            }

        }  
        return answer;
    }
}
