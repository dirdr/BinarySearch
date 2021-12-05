import java.util.*;

class Solution {
    public String[] solve(String[] path) {

        Stack<String> stack = new Stack<>();
        for (String cmd: path) {
            if (cmd.equals(".")) {
                continue;
            } else if (cmd.equals("..")) {
                if (!stack.empty()) {
                    stack.pop();
                }
            } else {
                stack.push(cmd);
            }
        }
        int length = stack.size();
        String[] result = new String[length];
        for (int i = 0; i < length; i++) {
            result[result.length-i-1] = stack.pop();
        }    
        return result;
    }
}
