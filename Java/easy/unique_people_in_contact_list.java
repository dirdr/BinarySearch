import java.util.*;

class Solution {
    public int solve(String[][] contacts) {
        int contact = 0;
        HashSet<String> set = new HashSet<>();
        for (String[] i : contacts) {
            boolean flag = true;
            for (String s : i) {
                if (!set.add(s)) {
                    flag = false;
                }
            }
            if (flag)
                contact++;
        }
        return contact;
    }
}
