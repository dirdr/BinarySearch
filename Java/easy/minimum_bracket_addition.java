import java.util.*;

class Solution {
    public int solve(String s) {
        int len = s.length();
        Stack<Character> stack = new Stack<>();
        for (char b: s.toCharArray()) {
            if (b == '(') {
                stack.push('(');
            } else {
                if (stack.empty()) {
                    stack.push(')');
                } else if (stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(')');
                }
            }
        }
        return stack.size();
    }
}
