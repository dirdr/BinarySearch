import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
    ArrayList<Integer> list = new ArrayList<>();
    public int[] solve(Tree root) {
        helper(root);
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
    public void helper(Tree root) {
        if (root == null) return;
        else {
            helper(root.left);
            list.add(root.val);
            helper(root.right);
        }
    }
}
