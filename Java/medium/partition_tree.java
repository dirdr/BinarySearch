import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
    int leaves = 0;
    int nodes = 0;
    public int[] solve(Tree root) {
        helper(root);
        return new int[] {leaves, nodes};
    }
    public void helper(Tree root) {
        if (root == null) {
            return;
        }
        if (root.left != null || root.right != null) {
            nodes++;
        } else {
            leaves++;
        }
        helper(root.left);
        helper(root.right);
    }
}
