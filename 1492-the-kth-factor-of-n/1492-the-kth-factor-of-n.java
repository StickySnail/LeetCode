import java.util.ArrayList;

class Solution {
    public int kthFactor(int n, int k) {

        int index_count = 0;

        for ( int i=1; i <= n; i++ ){
            if( n%i == 0) {
                index_count++;
                if ( index_count == k ) return i;
            }
        }

        return -1;
    }
}