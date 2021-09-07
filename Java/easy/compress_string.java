import java.util.*;

class Solution {
    public String solve(String s) {
        ArrayList<Character> answer = new ArrayList<>();
        answer.add(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (answer.get(answer.size()-1) != curr) {
                answer.add(curr);
            }
        }
        StringBuilder answer_sb = new StringBuilder();
        for (int i = 0; i < answer.size(); i++) {
            String element = String.valueOf(answer.get(i));
            answer_sb.append(element);
        } 
        return answer_sb.toString();
    }
}
