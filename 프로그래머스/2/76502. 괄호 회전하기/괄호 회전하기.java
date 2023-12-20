import java.util.Stack;

class Solution {
    public int solution(String s) {
        if (s.length() % 2 != 0) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i > 0) {
                s = s.substring(1) + s.substring(0, 1);
            }

            Stack<Character> stack = new Stack<>();
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (stack.isEmpty()) {
                    stack.add(c);
                } else if (stack.peek() == '(' && c == ')') {
                    stack.pop();
                } else if (stack.peek() == '{' && c == '}') {
                    stack.pop();
                } else if (stack.peek() == '[' && c == ']') {
                    stack.pop();
                } else {
                    stack.add(c);
                }
            }

            if (stack.isEmpty()) {
                count++;
            }
        }

        return count;
    }
}