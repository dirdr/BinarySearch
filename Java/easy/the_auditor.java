import java.util.*;

class Solution {
    public int solve(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 1;
        for (char ch: "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray()) {
            map.put(ch, i++);
        }
        int answer = 0;
        for (int idx = 0; idx < s.length(); idx++) {
            int curr = map.get(s.charAt(s.length()-idx-1));
            answer += (int)curr*Math.pow(26, idx);

        }
        return answer;
    }
}
