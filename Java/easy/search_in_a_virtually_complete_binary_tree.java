import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
    public boolean solve(Tree root, int target) {
        if (root == null) return false;
        else {
            if (root.val == target) return true;
        }
        return solve(root.left, target) || solve(root.right, target);
    }
}
