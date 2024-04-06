import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long x = Integer.parseInt(st.nextToken());
        long y = Integer.parseInt(st.nextToken());
        long z = percentage(x, y);

        long start = 1;
        long end = (long) 1e9;

        long answer = -1;
        while (start <= end) {
            long mid = (start + end) / 2;
            long newPercentage = percentage(x + mid, y + mid);

            if (newPercentage > z) {
                end = mid - 1;
                answer = mid;
            } else {
                start = mid + 1;
            }
        }

        System.out.println(answer);
    }

    private static long percentage(long x, long y) {
        return (y * 100 / x);
    }
}
