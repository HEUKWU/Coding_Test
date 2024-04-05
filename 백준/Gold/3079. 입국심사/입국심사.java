import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int max = 0;
        int[] immigrations = new int[n];
        for (int i = 0; i < n; i++) {
            int immigration = Integer.parseInt(br.readLine());
            immigrations[i] = immigration;

            max = Math.max(max, immigration);
        }

        long start = 1;
        long end = (long) max * m;

        long answer = end;
        while (start <= end) {
            long mid = (start + end) / 2;

            long sum = 0;
            for (int immigration : immigrations) {
                sum += mid / immigration;

                if (sum >= m) {
                    break;
                }
            }

            if (sum < m) {
                start = mid + 1;
            } else {
                end = mid - 1;
                answer = Math.min(answer, mid);
            }
        }

        System.out.println(answer);
    }
}