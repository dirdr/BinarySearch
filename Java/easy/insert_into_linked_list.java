import java.util.*;

/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {
    public LLNode solve(LLNode head, int pos, int val) {
        LLNode current = head;
        int count = 0;
        if (pos == 0) {
            LLNode returnable = new LLNode(val);
            returnable.next = head;
            return returnable;
        }
        while (current != null) {
            if (count == pos-1) {
                LLNode tail = current.next;
                current.next = new LLNode(val);
                current.next.next = tail;
                break;
            }
            count++;
            current = current.next;
        }
        return head;
    }
}
