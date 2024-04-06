import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            q.offer(Integer.parseInt(br.readLine()));
        }

        int count = 0;
        for (int i = 0; i < t; i++) {
            if (q.peek() < h || q.peek() == 1) {
                break;
            }
            q.offer(q.poll() / 2);
            count++;
        }

        if (q.peek() < h) {
            System.out.println("YES");
            System.out.println(count);
        } else {
            System.out.println("NO");
            System.out.println(q.poll());
        }
    }
}
