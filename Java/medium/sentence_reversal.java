import java.util.*;

class Solution {
    public String[] solve(String[] sentence) {
        reverse(0, sentence.length, sentence);
        int l  = 0;
        int r = 0;
        while (r < sentence.length) {
            if (!sentence[r].equals(" ")) {
                if (r == sentence.length-1) {
                    reverse(l, r+1, sentence);
                }
                r++;
            } else {
                reverse(l, r, sentence);
                l = ++r;
            }
        }
        return sentence;
    }

    public void reverse(int start, int end, String[] tab) {
        int length = end-start;
        int bound = length % 2 == 0 ? start + length/2: start + (length/2 + 1);
        for (int i = start; i < bound; i++) {
            String temp = tab[i];
            tab[i] = tab[end-i-1+start];
            tab[end-i-1+start] = temp;
        }
    }
}
