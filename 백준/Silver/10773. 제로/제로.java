import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k; i++) {
            int a = Integer.parseInt(br.readLine());

            if (a == 0) {
                stack.pop();
            } else {
                stack.push(a);
            }
        }

        int count = 0;
        for (Integer i : stack) {
            count += i;
        }

        System.out.println(count);
    }
}