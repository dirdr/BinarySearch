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
    public boolean solve(Tree root) { 
        helper(root);
        for (int i = 0; i < list.size()/2; i++) {
            if (list.get(i) != list.get(list.size()-1-i)) return false;
        } 
        return true;
    }

    public void helper(Tree root) {
        if (root == null) return;
        helper(root.left);
        list.add(root.val);
        helper(root.right);
    }
}
