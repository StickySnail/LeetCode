import java.util.Arrays;

class Solution {
    public int[] plusOne(int[] digits) {

        for (int i = 0; i < digits.length; i++) {
            if (digits[digits.length - 1 - i] + 1 == 10) {
                digits[digits.length - 1 - i] = 0;
                if (digits.length - 1 - i == 0) {
                    int[] newDigits = new int[digits.length + 1];
                    newDigits[0] = 1;
                    return newDigits;
                }
            } else {
                digits[digits.length - 1 - i] += 1;
                break;
            }
        }
        return digits;
    }
}