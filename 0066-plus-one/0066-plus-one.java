import java.util.Arrays;

class Solution {
    public int[] plusOne(int[] digits) {
        int[] newDigits = new int[digits.length + 1];
        for (int i = 0; i < digits.length; i++) {
            if (digits[digits.length - 1 - i] + 1 == 10) {
                digits[digits.length - 1 - i] = 0;
                if (digits.length - 1 - i == 0) {
                    newDigits[0] = 1;
                    for (int j = 0; j < digits.length; j++)
                        newDigits[j + 1] = digits[j];
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