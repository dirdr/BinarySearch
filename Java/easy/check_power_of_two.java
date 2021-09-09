import java.util.*;

class Solution {
    public boolean solve(int n) {
        double log = Math.log10(n)/Math.log10(2);
        return ((int) log == log); 
    }
}
