import java.util.*;

class Solution {
    public int[] solve(int[] heights) {

        ArrayList<Integer> list = new ArrayList<>();
        int max = 0;
        for (int i = heights.length-1; i >= 0; i--) {
            if (heights[i] > max) {
                max = heights[i];
                list.add(i);
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;     
    }
}
