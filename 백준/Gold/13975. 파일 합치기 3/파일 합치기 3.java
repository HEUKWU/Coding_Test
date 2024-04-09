import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            PriorityQueue<Long> q = new PriorityQueue<>();
            for (int j = 0; j < k; j++) {
                q.add(Long.parseLong(st.nextToken()));
            }

            sb.append(combine(q)).append('\n');
        }

        System.out.println(sb);
    }

    private static long combine(PriorityQueue<Long> q) {
        long sum = 0;
        while (q.size() >= 2) {
            long s = 0;
            Long c1 = q.poll();
            Long c2 = q.poll();

            sum += c1 + c2;
            s += c1 + c2;
            q.add(s);
        }

        return sum;
    }
}
