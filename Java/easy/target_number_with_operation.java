import java.util.*;

class Solution {
    public int solve(int start, int end) {
        int num = 0;
        int current = end;
        
        while (current > start) {
            if (current % 2 == 0) {
                if (current / 2 >= start) {
                    current /= 2;
                } else {
                    return num + (current-start);
                }
            } else {
                current--;
            }
            num++;
        }
        return num;
    }
}
