import java.util.*;

class Solution {
    public int solve(int[] cells) {
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < cells.length; i++) {
            queue.offer(cells[i]);
        }
        while (queue.size() > 1) {
            int polled = queue.poll();
            int spolled = queue.poll();
            if (polled != spolled) {
                queue.offer((int)Math.floor(polled + spolled)/3);
            }
        }
        return queue.size() == 1 ? queue.poll(): -1;
    }
}
