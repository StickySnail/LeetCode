class Solution {
    static public int countOdds(int low, int high) {
        
        if(low == high)
            return low%2;
        // odd odd
        else if(low%2 != 0 && high%2 != 0)
          return 2+ (high-low-1)/2;
        // odd even
        else if(low%2 != 0 || high%2 != 0)
          return 1 + (high-low)/2;
        // even even
        else
          return (high-low+1)/2;


    }

}