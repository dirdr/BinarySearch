import java.util.*;

class Solution {
    public int[][] solve(int[][] matrix) {
        if (matrix.length==0) {
            return new int[0][0];
        }
        int[][] answer = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                answer[i][j] = matrix[j][i];
            }
        }
        return answer;
    }
}
