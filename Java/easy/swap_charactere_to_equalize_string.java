import java.util.*;

class Solution {
    public boolean solve(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch: s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for (char ch: t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for (char key: map.keySet()) {
            if (map.get(key) % 2 != 0) return false;
        }
        return true;
    }
}
