import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] index = new int[100_001];

        Queue<Integer> q = new LinkedList<>();
        q.add(n);
        index[n] = 1;

        while (!q.isEmpty()) {
            Integer x = q.poll();

            int nx = x + 1;
            if (0 <= nx && nx < 100_001) {
                if (index[nx] == 0) {
                    q.add(nx);
                    index[nx] = index[x] + 1;
                }
            }

            nx = x - 1;
            if (0 <= nx && nx < 100_001) {
                if (index[nx] == 0) {
                    q.add(nx);
                    index[nx] = index[x] + 1;
                }
            }

            nx = x * 2;
            if (0 <= nx && nx < 100_001) {
                if (index[nx] == 0) {
                    q.add(nx);
                    index[nx] = index[x] + 1;
                }
            }
        }

        System.out.println(index[k] - 1);
    }
}
