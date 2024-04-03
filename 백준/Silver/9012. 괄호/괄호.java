import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            String parenthesis = br.readLine();
            sb.append(check(parenthesis) ? "YES" : "NO").append('\n');
        }

        System.out.println(sb);
    }

    private static boolean check(String parenthesis) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < parenthesis.length(); i++) {
            char c = parenthesis.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
