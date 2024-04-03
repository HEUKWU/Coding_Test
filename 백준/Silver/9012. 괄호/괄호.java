import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String parenthesis = br.readLine();
            
            check(parenthesis);
        }

        System.out.println(sb);
    }

    private static void check(String parenthesis) {
        Stack<Character> stack = new Stack<>();
        char first = parenthesis.charAt(0);

        if (first == ')') {
            sb.append("NO").append('\n');
            return;
        }

        stack.add(first);

        for (int i = 1; i < parenthesis.length(); i++) {
            char c = parenthesis.charAt(i);

            if (stack.isEmpty()) {
                stack.add(c);
                continue;
            }

            if (stack.peek() == '(' && c == ')') {
                stack.pop();
            } else {
                stack.add(c);
            }
        }

        if (stack.isEmpty()) {
            sb.append("YES");
        } else {
            sb.append("NO");
        }

        sb.append('\n');
    }
}
