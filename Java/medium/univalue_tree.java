import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
    public boolean solve(Tree root) {
        if (root == null) {
            return false;
        } else {
            return check(root, root.val);
        }
    }
    public boolean check(Tree root, int value) {
        if (root == null) {
            return true;
        } else if (root.val != value) {
            return false;
        } else {
            return check(root.left, value) && check(root.right, value);
        }
    }
}
