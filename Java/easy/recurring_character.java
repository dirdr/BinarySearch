import java.util.*;

class Solution {
    public int solve(String s) { 
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (set.contains(curr)) {
                return i;
            } else {
                set.add(curr);
            }
        }
        return -1;
    }
}
