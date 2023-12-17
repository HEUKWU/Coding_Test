import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.add(c);
            }
        }
        
        return stack.isEmpty() ? 1 : 0;
    }
}