import java.util.*;

class Solution {
    public int[] solve(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int key: map.keySet()) {
            if (map.get(key) > 1) {
                set.add(key);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (set.contains(num)) {
                if (map.get(num) > 1) {
                    list.add(num);
                    map.put(num, map.get(num)-1);
                } 
            } else {
                list.add(num);
            }
        }
        int len = list.size();
        int[] answer = new int[len];
        for (int i = 0; i < len; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    
    }
}
