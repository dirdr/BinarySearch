import java.util.*;

/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {
    public LLNode solve(LLNode node) {

        LLNode current = node;
        while (current != null) {
            int value = current.val;
            LLNode temp = current;
            while (value > 0) {
                temp = temp.next;
                if (temp == null) {
                    current.next = null;
                    break;
                }
                value--;
            }
            current.next = temp;
            current = current.next;
        }
        return node;
    }
}
