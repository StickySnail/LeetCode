class Solution {
    public int climbStairs(int n) {

        if (n <= 2) return n;

        int first = 1;
        int second = 2;
        int steps = 0;
        for (int i = 0; i < n - 2; i++) {
            steps = first + second;
            first = second;
            second = steps;
            System.out.println(first + " " + second + " " + steps);
        }
        return steps;
    }
}