import java.util.*;

class Solution {
    public int solve(String[] words, String letters) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch: letters.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        int max = 0;
        for (String word: words) {
            HashMap<Character, Integer> ver_map = new HashMap<Character, Integer>(map);
            boolean cmw = true;
            for (char ch: word.toCharArray()) {
                if (ver_map.containsKey(ch) && ver_map.get(ch) > 0) {
                    ver_map.put(ch, ver_map.get(ch)-1);
                } else {
                    cmw = false;
                    break;
                }
            }
            if (cmw) {
                max = word.length() > max ? word.length(): max;
            }
        }
        return max;
    }
}
