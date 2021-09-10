import java.util.*;

class Solution {
    public int solve(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char curr = t.charAt(i);
            map.put(curr, map.getOrDefault(curr, 0)+1);
        }
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (map.containsKey(curr) && map.get(curr) > 0) {
                map.put(curr, map.get(curr) -1);
            }
        }
        int sum = 0;
        for (char key: map.keySet()) {
            sum += map.get(key);
        }
        return sum;
    }
}
