import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max = 0;
        double[] arr = new double[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int j = 0; j < n; j++) {
            int a = Integer.parseInt(st.nextToken());
            if (a > max) {
                max = a;
            }
            arr[j] = a;
        }

        double sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i] / max * 100;
        }

        System.out.println(sum / n);

    }
}