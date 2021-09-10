import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {


    int nodes = 0;

    public int solve(Tree root) {
        helper(root);
        return nodes;
    }

    public void helper(Tree root) {
        if (root == null) {
            return;
        } else {
            nodes++;
        }
        helper(root.left);
        helper(root.right);
    }
}
