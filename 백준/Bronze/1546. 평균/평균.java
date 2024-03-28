import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int t = Integer.parseInt(st.nextToken());
            a[i] = t;
            max = Math.max(max, t);
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += ((double) a[i] / max) * 100;
        }

        System.out.println(sum / n);
    }
}