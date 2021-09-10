import java.util.*;

class Solution {
    public boolean solve(String s) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (Character.isLowerCase(curr)) {
                sb.append(curr);
            }
        }
        System.out.println(sb.toString());
        String w = sb.toString();
        for (int i = 0; i < w.length()/2; i++) {
            if (w.charAt(i) != w.charAt(w.length()-i-1)) return false;
        }   
        return true;   
    }
}
