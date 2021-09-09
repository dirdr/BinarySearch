import java.util.*;

/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {
    public int solve(LLNode node) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(node.val);
        while (node.next != null) {
            node = node.next;
            list.add(node.val);
        }
        System.out.println(list);
        int pow_i = 0;
        int answer = 0;
        for (int i = list.size()-1; i >= 0; i--) {
            if (list.get(i) == 1) {
                answer += Math.pow(2, pow_i);
            }
            pow_i++;
        }
        return answer;     
    }
}
