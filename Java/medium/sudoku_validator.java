import java.util.*;

class Solution {
    public boolean solve(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = 0; j < matrix[0].length; j++) {
                if (!set.contains(matrix[i][j])) {
                    set.add(matrix[i][j]);
                } else {
                    return false;
                }
                if (matrix[i][j] < 1 || matrix[i][j] > 9) {
                    return false;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = 0; j < matrix[0].length; j++) {
                if (!set.contains(matrix[j][i])) {
                    set.add(matrix[j][i]);
                } else {
                    return false;
                }
            }
        }

        for (int i = 0; i < matrix.length-3; i+=3) {
            for (int j = 0; j < matrix[0].length; j+=3) {
                int[][] sub = extract_matrix(matrix, i, j, 3);
                HashSet<Integer> set = new HashSet<>();
                for (int k = 0; k < sub.length; k++) {
                    for (int l = 0; l < sub[0].length; l++) {
                        if (!set.contains(sub[k][l])) {
                            set.add(sub[k][l]);
                        } else {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public int[][] extract_matrix(int[][] base_matrix, int start_row, int start_col, int square_dim) {
        int[][] returnable = new int[square_dim][square_dim];
        int index_i = 0;
        for (int i = start_row; i < start_row + square_dim; i++) {
            int index_j = 0;
            for (int j = start_col; j < square_dim + start_col; j++) {
                int value = base_matrix[i][j];
                returnable[index_i][index_j] = value;
                index_j++;
            }
            index_i++;
        } 
        return returnable;
    }
    
}
