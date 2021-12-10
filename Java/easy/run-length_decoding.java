import java.util.*;

class Solution {
    public String solve(String s) {

        String result = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (Character.isDigit(curr)) {
                sb.append(Character.getNumericValue(curr));
            } else {
                int num = Integer.parseInt(sb.toString());
                for (int j = 0; j < num; j++) {
                    result += s.charAt(i);
                }
                sb = new StringBuilder();
            }
        }
        return result;
        
    }
}
