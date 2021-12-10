import java.util.*;

class Solution {
    public int solve(String s, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length()-k+1; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < i+k; j++) {
                sb.append(s.charAt(j));
            }
            map.put(sb.toString(), map.getOrDefault(sb.toString(), 0)+1);
            sb = new StringBuilder();
        }
        int count = 0;
        for (String key: map.keySet()) {
            if (map.get(key) > 1) {
                count++;
            }
        }
        System.out.print(map);
        return count;
    }
}
