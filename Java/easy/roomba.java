import java.util.*;

class Solution {
    public boolean solve(String[] moves, int x, int y) {
        int vx = 0;
        int vy = 0;
        for (int i = 0; i < moves.length; i++) {
            String move = moves[i];
            switch (move) {
                case "NORTH":
                    vy++;
                    break;
                case "SOUTH":
                    vy--;
                    break;
                case "EAST":
                    vx++;
                    break;
                case "WEST":
                    vx--;
            }

        }
        return (x == vx && y == vy);
    }
}
