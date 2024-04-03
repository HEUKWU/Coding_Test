import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            String docs = br.readLine();
            String levels = br.readLine();
            sb.append(print(docs, levels)).append('\n');
        }

        System.out.println(sb);
    }

    private static int print(String docs, String levels) {
        StringTokenizer st = new StringTokenizer(docs);
        int n = Integer.parseInt(st.nextToken());
        int index = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        Queue<Integer> q = new LinkedList<>();

        st = new StringTokenizer(levels);
        for (int i = 0; i < n; i++) {
            int level = Integer.parseInt(st.nextToken());
            arr[i] = level;
            q.add(i);
        }

        int count = 0;
        while (!q.isEmpty()) {
            boolean b = false;
            int prev = q.poll();

            for (int i : arr) {
                if (arr[prev] < i) {
                    q.add(prev);
                    b = true;
                    break;
                }
            }

            if (!b) {
                count++;
                arr[prev] = 0;
                if (prev == index) {
                    return count;
                }
            }
        }

        return count;
    }
}
