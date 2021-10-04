import java.util.*;

class Solution {
    public int solve(String[] shows, int[] durations, int k) {

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < durations.length; i++) {
            if (map.containsKey(shows[i])) {
                map.put(shows[i], map.get(shows[i])+durations[i]);
            } else {
                map.put(shows[i], durations[i]);
            }
        }
        int index = k;
        int sum = 0; 
        while (index > 0) {
            int max = 0;
            String maxs = "";
            for (String key: map.keySet()) {
                if (map.get(key) > max && map.get(key) != -1) {
                    max = map.get(key);
                    maxs = key;
                }
            }
            index--;
            sum+=max;
            map.put(maxs, -1);
        }
        return sum;
    }
}
