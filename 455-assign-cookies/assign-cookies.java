
import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0; // Child pointer
        int j = 0; // Cookie pointer
        int value = 0; // Satisfied children count

        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                value++;
                i++;
                j++;
            } else {
                j++;
            }
        }

        return value;
    }
}
