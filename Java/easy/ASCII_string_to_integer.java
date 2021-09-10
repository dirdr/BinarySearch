import java.util.*;

class Solution {
    public int solve(String s) {
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (Character.isDigit(curr)) {
                sb.append(curr);
            } else {
                if (!sb.toString().equals("")) {
                    count += Integer.parseInt(sb.toString());
                    sb = new StringBuilder();
                }
            }
        }
        if (!sb.toString().equals("")) {
            count += Integer.parseInt(sb.toString());
        }
        return count;
    }
}
