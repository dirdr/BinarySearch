import java.util.*;

/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {
    public int solve(LLNode node) {
        int len = 0;
        while (node != null) {
            len++;
            node = node.next;
        }
        return len;   
    }
}
