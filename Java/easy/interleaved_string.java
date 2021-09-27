import java.util.*;

class Solution {
    public String solve(String s0, String s1) {

        String shortest = "";
        String longest = "";
        if (s0.length() < s1.length()) {
            shortest = s0;
            longest = s1;
        } else {
            shortest = s1;
            longest = s0;
        }
        StringBuilder sb = new StringBuilder();
        int len = shortest.length();
        int i = 0;
        int j = 0;
        while (i < shortest.length() && j < shortest.length()) {
            sb.append(s0.charAt(i));
            sb.append(s1.charAt(j));
            i++;
            j++;
        }
        for (int k = j; k < longest.length(); k++) {
            sb.append(longest.charAt(k));
        }
        return sb.toString();
    }
}
