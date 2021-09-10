import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
    int count = 0;
    public int solve(Tree root) {
        helper(root);
        return count;
    }

    public int helper(Tree root) {
        if (root == null) return 0;
        int left = helper(root.left);
        int right = helper(root.right);
        if (root.val >= Math.max(left, right)) count++;
        return Math.max(root.val, Math.max(left, right));
    }
}
