import java.util.*;

class Solution {
    public boolean solve(String[][] matrix) {

        HashSet<String> set = new HashSet<>();;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                set.add(matrix[i][j]);
                for (int k = 0; k < matrix.length; k++) {
                    System.out.println(matrix[i][k]);
                    if (k != j && matrix[i][k].equals(matrix[i][j])) {
                        return false;
                    }
                }
                for (int k = 0; k < matrix[0].length; k++) {
                    if (k != i && matrix[k][j].equals(matrix[i][j])) {
                        return false;
                    }
                }
            }
        }
        return set.size() == matrix.length ? true: false;
        
    }
}
