import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[50_002];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine().split(" ")[1]);
        }

        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() && stack.peek() > arr[i]) {
                answer += 1;
                stack.pop();
            }

            if (!stack.isEmpty() && stack.peek() == arr[i]) {
                continue;
            }

            stack.push(arr[i]);
        }

        System.out.println(answer);
    }
}
