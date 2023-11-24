import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int[] arr = new int[a];
            double sum = 0;

            for (int j = 0; j < a; j++) {
                int b = Integer.parseInt(st.nextToken());
                arr[j] = b;
                sum += b;
            }

            double avg = sum / a;
            int count = 0;

            for (int k : arr) {
                if (k > avg) {
                    count++;
                }
            }

            double rate = (double) count / a * 100;

            System.out.printf("%.3f%%\n", (int) (rate * 1000 + 0.5) / 1000f);
        }
    }
}