import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] time = new int[n][2];

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            time[i][0] = Integer.parseInt(st.nextToken());
            time[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(time, (a, b) -> {
            if (a[1] == b[1]) {
                return a[0] - b[0];
            }

            return a[1] - b[1];
        });

        int count = 0;
        int prev = 0;
        for (int i = 0; i < n; i++) {
            if (prev <= time[i][0]) {
                count++;
                prev = time[i][1];
            }
        }

        System.out.println(count);
    }
}
