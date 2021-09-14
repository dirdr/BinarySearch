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
        int height = height(root);
        for (int i = 0; i <= height; i++) {
            helper(root, i);
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public int height(Tree root) {
        if (root == null) {
            return 0;
        } 
        int r = height(root.right);
        int l = height(root.left);
        if (r > l) return r+1;
        else return l+1;
    }

    public void helper(Tree root, int level) {
        if (root == null) return;
        if (level == 1) list.add(root.val);
        helper(root.left, level-1);
        helper(root.right, level-1);
    }
}
