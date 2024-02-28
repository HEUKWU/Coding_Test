import java.util.Stack;

class Solution {
    boolean solution(String s) {
        if (s.charAt(0) == ')') {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.empty()) {
                stack.push(c);
                continue;
            }

            if (c == ')' && stack.peek() == '(') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.empty();
    }
}