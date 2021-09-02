import java.util.*;

class Solution {
    public int[][] solve(int[][] matrix) {


        if (matrix.length <= 1) {
            return matrix;
        }
        int[][] answer = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix[0].length; i++) {
            int[] curr = new int[matrix.length];
            for (int j = 0; j < matrix.length; j++) {
                curr[j] = matrix[j][i];
            }
            Arrays.sort(curr);
            for (int j = 0; j < answer.length; j++) {
                answer[j][i] = curr[j];
            }
        }
        return answer;


        
    }
}
