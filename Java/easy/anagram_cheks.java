import java.util.*;

class Solution {
    public boolean solve(String s0, String s1) {
        if (s0.length() != s1.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch: s0.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for (char ch: s1.toCharArray()) {
            if (map.containsKey(ch) && map.get(ch) > 0) {
                map.put(ch, map.get(ch) - 1);
            } else {
                return false;
            }
        }
        return true;     
    }
}
