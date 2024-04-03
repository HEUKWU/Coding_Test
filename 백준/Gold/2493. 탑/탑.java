import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Tower> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int tower = Integer.parseInt(st.nextToken());

            while (!stack.isEmpty()) {
                Tower leftTower = stack.peek();
                if (leftTower.height >= tower) {
                    sb.append(leftTower.index).append(' ');
                    break;
                }
                stack.pop();
            }

            if (stack.isEmpty()) {
                sb.append("0 ");
            }

            stack.push(new Tower(i + 1, tower));
        }

        System.out.println(sb);
    }

    static class Tower {
        private final int index;
        private final int height;

        public Tower(int index, int height) {
            this.index = index;
            this.height = height;
        }
    }
}
