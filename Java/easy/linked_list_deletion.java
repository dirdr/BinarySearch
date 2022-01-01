import java.util.*;

/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {
    public LLNode solve(LLNode node, int target) {
        LLNode current = node;
        while (current != null && current.val == target) {
            node = current.next;
            current = node;
        }
        if (current == null) return null;
        while (current.next != null) {
            if (current.next.val == target) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return node; 
    }
}
