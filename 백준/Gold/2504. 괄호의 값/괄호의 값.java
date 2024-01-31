import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int count = 1;
        int result = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push('(');
                count *= 2;
            } else if (c == '[') {
                stack.push('[');
                count *= 3;
            } else if (c == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    result = 0;
                    break;
                }
                if (s.charAt(i - 1) == '(') {
                    result += count;
                }
                stack.pop();
                count /= 2;
            } else {
                if (stack.isEmpty() || stack.peek() != '[') {
                    result = 0;
                    break;
                }
                if (s.charAt(i - 1) == '[') {
                    result += count;
                }

                stack.pop();
                count /= 3;
            }
        }

        System.out.println(!stack.isEmpty() ? 0 : result);
    }
}
