import java.util.*;

class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char value = s.charAt(i);
            if (value == '(' || value == '[' || value == '{')
                stack.push(value);
            else {
                if (stack.isEmpty()) return false;
                if (value == ')' && stack.peek() == '(') stack.pop();
                else if (value == '}' && stack.peek() == '{') stack.pop();
                else if (value == ']' && stack.peek() == '[') stack.pop();
                else return false;
            }
        }
        return stack.empty();

    }
}