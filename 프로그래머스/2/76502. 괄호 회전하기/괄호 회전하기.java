import java.util.Stack;

class Solution {
    public int solution(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (right(s)) {
                count++;
            }
            s = s.substring(1) + s.charAt(0);
        }

        return count;
    }

    private boolean right(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.isEmpty()) {
                stack.push(c);
                continue;
            }

            if (stack.peek() == '(' && c == ')') {
                stack.pop();
            } else if (stack.peek() == '{' && c == '}') {
                stack.pop();
            } else if (stack.peek() == '[' && c == ']') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}