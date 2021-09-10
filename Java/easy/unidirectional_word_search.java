import java.util.*;

class Solution {
    public boolean solve(String[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < board[i].length; j++) {
                sb.append(board[i][j]);
            }
            if (sb.toString().contains(word)) return true;
        }
        for (int i = 0; i < board[0].length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < board.length; j++) {
                sb.append(board[j][i]);
            }
            if (sb.toString().contains(word)) return true;
        }
        return false;
    }
}
