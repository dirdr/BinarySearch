import java.util.*;

class Solution {
    public boolean solve(int[][] votes) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < votes.length; i++) {
            set.add(votes[i][1]);
        }
        return set.size() != votes.length;
    }
}
