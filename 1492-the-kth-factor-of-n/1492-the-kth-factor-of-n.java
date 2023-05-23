import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int kthFactor(int n, int k) {

        ArrayList<Integer> factors = new ArrayList<>();

        int left = 1;

        for (; ; ) {
            if (left == n / left && n%left == 0) {
                factors.add(left);
                break;
            }
            if (left > n / left) break;
            if (n % left == 0) {
                factors.add(left);
                factors.add(n / left);
            }
            left++;
        }
        Collections.sort(factors);
        System.out.println(factors);
        if(k > factors.size()) return -1;
        return factors.get(k - 1);


    }
}