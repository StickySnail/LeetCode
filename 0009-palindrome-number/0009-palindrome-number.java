class Solution {
    public boolean isPalindrome(int x) {

        String num = Integer.toString(x);

        String[] numStr = num.split("");

        for (int i = 0; i < numStr.length / 2; i++) {
            if (!(numStr[i].equals(numStr[numStr.length - i - 1]))) return false;
        }
        return true;

    }
}