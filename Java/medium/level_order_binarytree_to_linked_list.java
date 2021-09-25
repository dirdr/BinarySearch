import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */

/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {


    ArrayList<Integer> list = new ArrayList<>();

    public LLNode solve(Tree root) {

        LLNode answer = null;

        int height = height(root);
        for (int i = 0; i <= height; i++) {
            helper(root, i);
        }
        for (int i = 0; i < list.size(); i++) {
            if (answer == null) {
                answer = new LLNode(list.get(i));
            } else {
                LLNode new_node = new LLNode(list.get(i));
                new_node.next = null;
                LLNode last = answer;
                while (last.next != null) {
                    last = last.next;
                }
                last.next = new_node;
            }
        }
        return answer;
    }

    public int height(Tree root) {
        if (root == null) return 0;
        int lheight = height(root.left);
        int rheight = height(root.right);
        if (lheight > rheight) return lheight+1;
        else {
            return rheight+1;
        }
    }

    public void helper(Tree root, int level) {
        if (root == null) return;
        if (level == 1) {
            list.add(root.val);
        } else if (level > 1) {
            helper(root.left, level-1);
            helper(root.right, level-1);
        
        }
    }
}
