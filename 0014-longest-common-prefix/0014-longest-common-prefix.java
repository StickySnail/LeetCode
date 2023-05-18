import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);
        String left = strs[0];
        String right = strs[strs.length - 1];
        int index = 0;
        while (index < left.length()) {
            if (left.charAt(index) == right.charAt(index)) index++;
            else break;
        }
        return left.substring(0,index);
    }
}