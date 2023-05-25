class Solution {
    public String addBinary(String a, String b) {

        int x = a.length() - 1;
        int y = b.length() - 1;
        int carry = 0;
        StringBuilder ans = new StringBuilder();

        while (x >= 0 || y >= 0) {

            int sum = carry;

            if (x >= 0) sum += a.charAt(x) - '0';
            if (y >= 0) sum += b.charAt(y) - '0';

            // Every cases : 00 / 01 / 10 / 11
            if (sum == 0 || sum == 1) {
                ans.append(sum);
                carry = 0;
            } else if (sum == 2) {
                ans.append("0");
                carry = 1;
            } else { // when sum == 3
                ans.append("1");
                carry = 1;
            }
            x -= 1;
            y -= 1;
        }
        if(carry == 1) ans.append("1"); // if the very left is more than 2

        return ans.reverse().toString();

    }
}