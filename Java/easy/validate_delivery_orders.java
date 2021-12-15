import java.util.*;

class Solution {
    public boolean solve(String[] orders) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (String s: orders) {
            char inst = s.charAt(0);
            int number = Integer.parseInt(s.substring(1));
            if (inst == 'P') {
                if (map.containsKey(number)) {
                    return false;
                } else {
                    map.put(number, false);
                }
            } else {
                if (map.containsKey(number)) {
                    if (map.get(number) == true) {
                        return false;
                    } else {
                        map.put(number, true);
                    }
                } else {
                    return false;
                }
            } 
        }
        for (int num: map.keySet()) {
            if (map.get(num) == false) return false;
        }
        return true;
    }
}
